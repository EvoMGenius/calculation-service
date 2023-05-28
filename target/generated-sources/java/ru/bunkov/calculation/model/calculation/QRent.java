package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRent is a Querydsl query type for Rent
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRent extends BeanPath<Rent> {

    private static final long serialVersionUID = -1519643532L;

    public static final QRent rent = new QRent("rent");

    public final StringPath name3 = createString("name3");

    public QRent(String variable) {
        super(Rent.class, forVariable(variable));
    }

    public QRent(Path<? extends Rent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRent(PathMetadata metadata) {
        super(Rent.class, metadata);
    }

}

