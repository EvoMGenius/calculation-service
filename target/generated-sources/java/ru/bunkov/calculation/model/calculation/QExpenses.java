package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExpenses is a Querydsl query type for Expenses
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QExpenses extends BeanPath<Expenses> {

    private static final long serialVersionUID = -652876074L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExpenses expenses = new QExpenses("expenses");

    public final ComparablePath<java.util.UUID> industryId = createComparable("industryId", java.util.UUID.class);

    public final QJobPayment jobPayment;

    public final ru.bunkov.calculation.model.calculation.taxandsalary.QOtherTax otherTax;

    public final ComparablePath<java.util.UUID> subindustryId = createComparable("subindustryId", java.util.UUID.class);

    public QExpenses(String variable) {
        this(Expenses.class, forVariable(variable), INITS);
    }

    public QExpenses(Path<? extends Expenses> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExpenses(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExpenses(PathMetadata metadata, PathInits inits) {
        this(Expenses.class, metadata, inits);
    }

    public QExpenses(Class<? extends Expenses> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.jobPayment = inits.isInitialized("jobPayment") ? new QJobPayment(forProperty("jobPayment")) : null;
        this.otherTax = inits.isInitialized("otherTax") ? new ru.bunkov.calculation.model.calculation.taxandsalary.QOtherTax(forProperty("otherTax")) : null;
    }

}

