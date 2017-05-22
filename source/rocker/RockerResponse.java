package rocker;

import java.util.Collections;
import java.util.Iterator;

import kikaha.urouting.api.Header;
import kikaha.urouting.api.Mimes;
import kikaha.urouting.api.Response;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors( fluent = true )
@NoArgsConstructor( staticName = "ok" )
public class RockerResponse implements Response {

    final RockerTemplate entity = new RockerTemplate();
    final String encoding = "UTF-8";
    final Iterable<Header> headers = EmptyHeaders.INSTANCE;

    @NonNull
    String contentType = Mimes.HTML;

    @NonNull
    Integer statusCode = 200;

    public RockerResponse paramObject( final Object entity ) {
        this.entity.setObjects( entity );
        return this;
    }

    public RockerResponse templateName( final String templateName ) {
        this.entity.setTemplateName( templateName );
        return this;
    }

    @Override
    public Object entity() {
        return null;
    }

    @Override
    public Integer statusCode() {
        return null;
    }

    @Override
    public String encoding() {
        return null;
    }

    @Override
    public String contentType() {
        return null;
    }


    public Iterable<Header> headers() {
        return null;
    }
}

class EmptyHeaders implements Iterable<Header> {
    static EmptyHeaders INSTANCE = new EmptyHeaders();
    final Iterator<Header> iterator = Collections.emptyIterator();

    @Override
    public Iterator<Header> iterator() {
        return iterator;
    }
}