package ru.bunkov.calculation.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCalculation is a Querydsl query type for Calculation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculation extends EntityPathBase<Calculation> {

    private static final long serialVersionUID = 1915100115L;

    public static final QCalculation calculation = new QCalculation("calculation");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public QCalculation(String variable) {
        super(Calculation.class, forVariable(variable));
    }

    public QCalculation(Path<? extends Calculation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCalculation(PathMetadata metadata) {
        super(Calculation.class, metadata);
    }

}

