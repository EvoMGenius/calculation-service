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

    public final NumberPath<Double> generalTaxationSystem = createNumber("generalTaxationSystem", Double.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final EnumPath<Form> organizationalAndLegalForm = createEnum("organizationalAndLegalForm", Form.class);

    public final NumberPath<Double> patent = createNumber("patent", Double.class);

    public final NumberPath<Double> simplifiedTaxationSystem = createNumber("simplifiedTaxationSystem", Double.class);

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

