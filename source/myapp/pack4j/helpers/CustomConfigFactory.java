package myapp.pack4j.helpers;

import org.pac4j.cas.client.CasClient;
import org.pac4j.core.authorization.authorizer.RequireAnyRoleAuthorizer;
import org.pac4j.core.client.Clients;
import org.pac4j.core.client.direct.AnonymousClient;
import org.pac4j.core.config.Config;
import org.pac4j.core.config.ConfigFactory;
import org.pac4j.http.client.direct.DirectBasicAuthClient;
import org.pac4j.http.client.direct.ParameterClient;
import org.pac4j.http.client.indirect.FormClient;
import org.pac4j.http.client.indirect.IndirectBasicAuthClient;
import org.pac4j.http.credentials.authenticator.test.SimpleTestUsernamePasswordAuthenticator;
import org.pac4j.jwt.credentials.authenticator.JwtAuthenticator;
import org.pac4j.oauth.client.FacebookClient;
import org.pac4j.oauth.client.TwitterClient;
import org.pac4j.oidc.client.OidcClient;
import org.pac4j.saml.client.SAML2Client;
import org.pac4j.saml.client.SAML2ClientConfiguration;

/**
 * https://github.com/pac4j/undertow-pac4j-demo/blob/master/src/main/java/org/pac4j/demo/undertow/DemoConfigFactory.java
 */
public class ConfigFactory {
    public Config build() {
        final OidcClient oidcClient = new OidcClient();
        oidcClient.setClientID("343992089165-sp0l1km383i8cbm2j5nn20kbk5dk8hor.apps.googleusercontent.com");
        oidcClient.setSecret("uR3D8ej1kIRPbqAFaxIE3HWh");
        oidcClient.setDiscoveryURI("https://accounts.google.com/.well-known/openid-configuration");
        oidcClient.setUseNonce(true);
        //oidcClient.setPreferredJwsAlgorithm(JWSAlgorithm.RS256);
        oidcClient.addCustomParam("prompt", "consent");
        oidcClient.setAuthorizationGenerator(profile -> profile.addRole("ROLE_ADMIN"));

        final SAML2ClientConfiguration cfg = new SAML2ClientConfiguration("resource:samlKeystore.jks",
                "pac4j-demo-passwd",
                "pac4j-demo-passwd",
                "resource:metadata-okta.xml");
        cfg.setMaximumAuthenticationLifetime(3600);
        cfg.setServiceProviderEntityId("http://localhost:8080/callback?client_name=SAML2Client");
        cfg.setServiceProviderMetadataPath("sp-metadata.xml");
        final SAML2Client saml2Client = new SAML2Client(cfg);

        final FacebookClient facebookClient = new FacebookClient("145278422258960", "be21409ba8f39b5dae2a7de525484da8");
        final TwitterClient twitterClient = new TwitterClient("CoxUiYwQOSFDReZYdjigBA", "2kAzunH5Btc4gRSaMr7D7MkyoJ5u1VzbOOzE8rBofs");
        // HTTP
        final FormClient formClient = new FormClient("http://localhost:8080/loginForm.html", new SimpleTestUsernamePasswordAuthenticator());
        final IndirectBasicAuthClient indirectBasicAuthClient = new IndirectBasicAuthClient(new SimpleTestUsernamePasswordAuthenticator());

        // CAS
        final CasClient casClient = new CasClient("https://casserverpac4j.herokuapp.com/login");

        // REST authent with JWT for a token passed in the url as the token parameter
        ParameterClient parameterClient = new ParameterClient("token", new JwtAuthenticator(Server.JWT_SALT));
        parameterClient.setSupportGetRequest(true);
        parameterClient.setSupportPostRequest(false);

        // basic auth
        final DirectBasicAuthClient directBasicAuthClient = new DirectBasicAuthClient(new SimpleTestUsernamePasswordAuthenticator());

        final AnonymousClient anonymousClient = new AnonymousClient();

        final Clients clients = new Clients("http://localhost:8080/callback", saml2Client, facebookClient, twitterClient,
                formClient, indirectBasicAuthClient, casClient, parameterClient, directBasicAuthClient, oidcClient, anonymousClient);

        final Config config = new Config(clients);
        config.addAuthorizer("admin", new RequireAnyRoleAuthorizer("ROLE_ADMIN"));
        config.addAuthorizer("custom", new Authorizer());
        return config;
    }

}
