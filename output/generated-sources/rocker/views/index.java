package views;

import java.io.IOException;
import com.fizzed.rocker.ForIterator;
import com.fizzed.rocker.RenderingException;
import com.fizzed.rocker.RockerContent;
import com.fizzed.rocker.RockerOutput;
import com.fizzed.rocker.runtime.DefaultRockerTemplate;
import com.fizzed.rocker.runtime.PlainTextUnloadedClassLoader;
// import @ [1:1]
import myapp.models.User;;
// import @ [2:1]
import myapp.models.Author;;

/*
 * Auto generated code to render template views/index.rocker.html
 * Do not edit this file. Changes will eventually be overwritten by Rocker parser!
 */
public class index extends com.fizzed.rocker.runtime.DefaultRockerModel {

    static public final com.fizzed.rocker.ContentType CONTENT_TYPE = com.fizzed.rocker.ContentType.HTML;
    static public final String TEMPLATE_NAME = "index.rocker.html";
    static public final String TEMPLATE_PACKAGE_NAME = "views";
    static public final String HEADER_HASH = "263811108";
    static public final long MODIFIED_AT = 1494316132000L;
    static public final String[] ARGUMENT_NAMES = { "u", "a" };

    // argument @ [4:2]
    private User u;
    // argument @ [4:2]
    private Author a;

    public index u(User u) {
        this.u = u;
        return this;
    }

    public User u() {
        return this.u;
    }

    public index a(Author a) {
        this.a = a;
        return this;
    }

    public Author a() {
        return this.a;
    }

    static public index template(User u, Author a) {
        return new index()
            .u(u)
            .a(a);
    }

    @Override
    protected DefaultRockerTemplate buildTemplate() throws RenderingException {
        // optimized for convenience (runtime auto reloading enabled if rocker.reloading=true)
        return com.fizzed.rocker.runtime.RockerRuntime.getInstance().getBootstrap().template(this.getClass(), this);
    }

    static public class Template extends com.fizzed.rocker.runtime.DefaultRockerTemplate {

        // Some Dummy Dynamic Data\n
        static private final byte[] PLAIN_TEXT_0_0;
        //  
        static private final byte[] PLAIN_TEXT_1_0;
        // \n<br>\n
        static private final byte[] PLAIN_TEXT_2_0;
        // \n
        static private final byte[] PLAIN_TEXT_3_0;

        static {
            PlainTextUnloadedClassLoader loader = PlainTextUnloadedClassLoader.tryLoad(index.class.getClassLoader(), index.class.getName() + "$PlainText", "UTF-8");
            PLAIN_TEXT_0_0 = loader.tryGet("PLAIN_TEXT_0_0");
            PLAIN_TEXT_1_0 = loader.tryGet("PLAIN_TEXT_1_0");
            PLAIN_TEXT_2_0 = loader.tryGet("PLAIN_TEXT_2_0");
            PLAIN_TEXT_3_0 = loader.tryGet("PLAIN_TEXT_3_0");
        }

        // argument @ [4:2]
        protected final User u;
        // argument @ [4:2]
        protected final Author a;

        public Template(index model) {
            super(model);
            __internal.setCharset("UTF-8");
            __internal.setContentType(CONTENT_TYPE);
            __internal.setTemplateName(TEMPLATE_NAME);
            __internal.setTemplatePackageName(TEMPLATE_PACKAGE_NAME);
            this.u = model.u();
            this.a = model.a();
        }

        @Override
        protected void __doRender() throws IOException, RenderingException {
            // ValueClosureBegin @ [6:1]
            __internal.aboutToExecutePosInTemplate(6, 1);
            __internal.renderValue(views.common.main.template("Home").__body(() -> {
                // PlainText @ [6:41]
                __internal.aboutToExecutePosInTemplate(6, 41);
                __internal.writeValue(PLAIN_TEXT_0_0);
                // ValueExpression @ [8:1]
                __internal.aboutToExecutePosInTemplate(8, 1);
                __internal.renderValue(u.name, false);
                // PlainText @ [8:8]
                __internal.aboutToExecutePosInTemplate(8, 8);
                __internal.writeValue(PLAIN_TEXT_1_0);
                // ValueExpression @ [8:9]
                __internal.aboutToExecutePosInTemplate(8, 9);
                __internal.renderValue(u.age, false);
                // PlainText @ [8:15]
                __internal.aboutToExecutePosInTemplate(8, 15);
                __internal.writeValue(PLAIN_TEXT_2_0);
                // ValueExpression @ [10:1]
                __internal.aboutToExecutePosInTemplate(10, 1);
                __internal.renderValue(a.name, false);
                // PlainText @ [10:8]
                __internal.aboutToExecutePosInTemplate(10, 8);
                __internal.writeValue(PLAIN_TEXT_1_0);
                // ValueExpression @ [10:9]
                __internal.aboutToExecutePosInTemplate(10, 9);
                __internal.renderValue(a.place, false);
                // PlainText @ [10:17]
                __internal.aboutToExecutePosInTemplate(10, 17);
                __internal.writeValue(PLAIN_TEXT_1_0);
                // ValueExpression @ [10:18]
                __internal.aboutToExecutePosInTemplate(10, 18);
                __internal.renderValue(a.role, false);
                // PlainText @ [10:25]
                __internal.aboutToExecutePosInTemplate(10, 25);
                __internal.writeValue(PLAIN_TEXT_3_0);
                // ValueClosureEnd @ [6:1]
                __internal.aboutToExecutePosInTemplate(6, 1);
            }), false); // value closure end @ [6:1]
        }
    }

    private static class PlainText {

        static private final String PLAIN_TEXT_0_0 = "Some Dummy Dynamic Data\n";
        static private final String PLAIN_TEXT_1_0 = " ";
        static private final String PLAIN_TEXT_2_0 = "\n<br>\n";
        static private final String PLAIN_TEXT_3_0 = "\n";

    }

}
