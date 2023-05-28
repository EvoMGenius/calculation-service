package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPairForBuilding is a Querydsl query type for PairForBuilding
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPairForBuilding extends BeanPath<PairForBuilding> {

    private static final long serialVersionUID = -490861995L;

    public static final QPairForBuilding pairForBuilding = new QPairForBuilding("pairForBuilding");

    public final NumberPath<Double> area = createNumber("area", Double.class);

    public final ComparablePath<java.util.UUID> buildingCostId = createComparable("buildingCostId", java.util.UUID.class);

    public QPairForBuilding(String variable) {
        super(PairForBuilding.class, forVariable(variable));
    }

    public QPairForBuilding(Path<? extends PairForBuilding> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPairForBuilding(PathMetadata metadata) {
        super(PairForBuilding.class, metadata);
    }

}

