package ru.bunkov.calculation.model.region;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegion is a Querydsl query type for Region
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRegion extends EntityPathBase<Region> {

    private static final long serialVersionUID = 1308227998L;

    public static final QRegion region = new QRegion("region");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<Double> landLease = createNumber("landLease", Double.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> purchaseLand = createNumber("purchaseLand", Double.class);

    public final NumberPath<Double> rentRoomMax = createNumber("rentRoomMax", Double.class);

    public final NumberPath<Double> rentRoomMin = createNumber("rentRoomMin", Double.class);

    public QRegion(String variable) {
        super(Region.class, forVariable(variable));
    }

    public QRegion(Path<? extends Region> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegion(PathMetadata metadata) {
        super(Region.class, metadata);
    }

}

