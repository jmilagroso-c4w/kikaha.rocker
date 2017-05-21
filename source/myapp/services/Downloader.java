package myapp.services;

import myapp.models.Author;
import myapp.models.Post;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jay on 5/21/17.
 */
public class Downloader {

    public static List<Post> init() {
        // Get posts JSON and translate
        GenericType<List<Post>> genericTypePost = new GenericType<List<Post>>(){};
        List<Post> posts = ClientBuilder.newClient()
                .target("http://maqe.github.io/json/posts.json")
                .request().accept(MediaType.APPLICATION_JSON)
                .get(genericTypePost);

        GenericType<List<Author>> genericTypeAuthor = new GenericType<List<Author>>(){};
        List<Author> authors = ClientBuilder.newClient()
                .target("http://maqe.github.io/json/authors.json")
                .request().accept(MediaType.APPLICATION_JSON)
                .get(genericTypeAuthor);

        Map<Integer, Author> map = new HashMap<Integer, Author>();
        for(Author a: authors) {
            map.put(a.id, a);
        }

        // Post-Author association.
        for(Post p: posts) {
            if(map.containsKey(p.author_id)) {
                p.author = map.get(p.author_id);
            }
        }

        return posts;
    }
}
