package ru.bunkov.calculation.model.income;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPotentialIncome is a Querydsl query type for PotentialIncome
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPotentialIncome extends EntityPathBase<PotentialIncome> {

    private static final long serialVersionUID = 1998877080L;

    public static final QPotentialIncome potentialIncome = new QPotentialIncome("potentialIncome");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final ListPath<ConditionalResult, QConditionalResult> result = this.<ConditionalResult, QConditionalResult>createList("result", ConditionalResult.class, QConditionalResult.class, PathInits.DIRECT2);

    public final StringPath typeOfBusiness = createString("typeOfBusiness");

    public QPotentialIncome(String variable) {
        super(PotentialIncome.class, forVariable(variable));
    }

    public QPotentialIncome(Path<? extends PotentialIncome> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPotentialIncome(PathMetadata metadata) {
        super(PotentialIncome.class, metadata);
    }

}

