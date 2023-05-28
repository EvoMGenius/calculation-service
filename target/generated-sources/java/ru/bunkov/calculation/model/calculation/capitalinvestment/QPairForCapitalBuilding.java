package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPairForCapitalBuilding is a Querydsl query type for PairForCapitalBuilding
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPairForCapitalBuilding extends BeanPath<PairForCapitalBuilding> {

    private static final long serialVersionUID = -25120389L;

    public static final QPairForCapitalBuilding pairForCapitalBuilding = new QPairForCapitalBuilding("pairForCapitalBuilding");

    public final NumberPath<Double> area = createNumber("area", Double.class);

    public final ComparablePath<java.util.UUID> buildingCostId = createComparable("buildingCostId", java.util.UUID.class);

    public QPairForCapitalBuilding(String variable) {
        super(PairForCapitalBuilding.class, forVariable(variable));
    }

    public QPairForCapitalBuilding(Path<? extends PairForCapitalBuilding> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPairForCapitalBuilding(PathMetadata metadata) {
        super(PairForCapitalBuilding.class, metadata);
    }

}

