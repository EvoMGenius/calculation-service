package ru.bunkov.calculation.model.income;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QConditionalResult is a Querydsl query type for ConditionalResult
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConditionalResult extends EntityPathBase<ConditionalResult> {

    private static final long serialVersionUID = 1005404212L;

    public static final QConditionalResult conditionalResult = new QConditionalResult("conditionalResult");

    public final StringPath conditionDescription = createString("conditionDescription");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<Double> potentialAnnualIncome = createNumber("potentialAnnualIncome", Double.class);

    public final NumberPath<Double> rate = createNumber("rate", Double.class);

    public final NumberPath<Double> totalPotentCost = createNumber("totalPotentCost", Double.class);

    public QConditionalResult(String variable) {
        super(ConditionalResult.class, forVariable(variable));
    }

    public QConditionalResult(Path<? extends ConditionalResult> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConditionalResult(PathMetadata metadata) {
        super(ConditionalResult.class, metadata);
    }

}

