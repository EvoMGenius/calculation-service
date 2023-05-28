package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLandCost is a Querydsl query type for LandCost
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QLandCost extends BeanPath<LandCost> {

    private static final long serialVersionUID = -1830826586L;

    public static final QLandCost landCost = new QLandCost("landCost");

    public final NumberPath<Double> areaOnRegions = createNumber("areaOnRegions", Double.class);

    public final NumberPath<java.math.BigDecimal> maxTotalLandCost = createNumber("maxTotalLandCost", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minTotalLandCost = createNumber("minTotalLandCost", java.math.BigDecimal.class);

    public final ListPath<String, StringPath> regionNames = this.<String, StringPath>createList("regionNames", String.class, StringPath.class, PathInits.DIRECT2);

    public QLandCost(String variable) {
        super(LandCost.class, forVariable(variable));
    }

    public QLandCost(Path<? extends LandCost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLandCost(PathMetadata metadata) {
        super(LandCost.class, metadata);
    }

}

