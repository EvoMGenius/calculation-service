package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTaxAndSalary is a Querydsl query type for TaxAndSalary
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QTaxAndSalary extends BeanPath<TaxAndSalary> {

    private static final long serialVersionUID = -1643949743L;

    public static final QTaxAndSalary taxAndSalary = new QTaxAndSalary("taxAndSalary");

    public final StringPath name4 = createString("name4");

    public QTaxAndSalary(String variable) {
        super(TaxAndSalary.class, forVariable(variable));
    }

    public QTaxAndSalary(Path<? extends TaxAndSalary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTaxAndSalary(PathMetadata metadata) {
        super(TaxAndSalary.class, metadata);
    }

}

