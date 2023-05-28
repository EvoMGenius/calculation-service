package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculation is a Querydsl query type for Calculation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculation extends EntityPathBase<Calculation> {

    private static final long serialVersionUID = -1532601042L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculation calculation = new QCalculation("calculation");

    public final ru.bunkov.calculation.model.accounting.QAccounting accounting;

    public final QCapitalInvestments capitalInvestments;

    public final QCostsOfOpeningProduction costs;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final QRent rent;

    public final QTaxAndSalary taxAndSalary;

    public QCalculation(String variable) {
        this(Calculation.class, forVariable(variable), INITS);
    }

    public QCalculation(Path<? extends Calculation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculation(PathMetadata metadata, PathInits inits) {
        this(Calculation.class, metadata, inits);
    }

    public QCalculation(Class<? extends Calculation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accounting = inits.isInitialized("accounting") ? new ru.bunkov.calculation.model.accounting.QAccounting(forProperty("accounting")) : null;
        this.capitalInvestments = inits.isInitialized("capitalInvestments") ? new QCapitalInvestments(forProperty("capitalInvestments")) : null;
        this.costs = inits.isInitialized("costs") ? new QCostsOfOpeningProduction(forProperty("costs")) : null;
        this.rent = inits.isInitialized("rent") ? new QRent(forProperty("rent")) : null;
        this.taxAndSalary = inits.isInitialized("taxAndSalary") ? new QTaxAndSalary(forProperty("taxAndSalary")) : null;
    }

}

