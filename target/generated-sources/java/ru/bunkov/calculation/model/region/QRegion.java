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

    private static final long serialVersionUID = -852653576L;

    public static final QRegion region = new QRegion("region");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<java.math.BigDecimal> landLease = createNumber("landLease", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> purchaseLand = createNumber("purchaseLand", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rentRoomMax = createNumber("rentRoomMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> rentRoomMin = createNumber("rentRoomMin", java.math.BigDecimal.class);

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

