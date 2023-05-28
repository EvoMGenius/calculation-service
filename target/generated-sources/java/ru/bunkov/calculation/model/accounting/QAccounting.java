package ru.bunkov.calculation.model.accounting;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccounting is a Querydsl query type for Accounting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccounting extends EntityPathBase<Accounting> {

    private static final long serialVersionUID = -910973864L;

    public static final QAccounting accounting = new QAccounting("accounting");

    public final NumberPath<java.math.BigDecimal> generalTaxationSystemMax = createNumber("generalTaxationSystemMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> generalTaxationSystemMin = createNumber("generalTaxationSystemMin", java.math.BigDecimal.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final EnumPath<Form> organizationalLegalForm = createEnum("organizationalLegalForm", Form.class);

    public final NumberPath<java.math.BigDecimal> patentMax = createNumber("patentMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> patentMin = createNumber("patentMin", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> simplifiedTaxationSystemMax = createNumber("simplifiedTaxationSystemMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> simplifiedTaxationSystemMin = createNumber("simplifiedTaxationSystemMin", java.math.BigDecimal.class);

    public QAccounting(String variable) {
        super(Accounting.class, forVariable(variable));
    }

    public QAccounting(Path<? extends Accounting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccounting(PathMetadata metadata) {
        super(Accounting.class, metadata);
    }

}

