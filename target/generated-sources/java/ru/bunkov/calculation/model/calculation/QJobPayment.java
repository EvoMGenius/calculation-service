package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QJobPayment is a Querydsl query type for JobPayment
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QJobPayment extends BeanPath<JobPayment> {

    private static final long serialVersionUID = 1597280388L;

    public static final QJobPayment jobPayment = new QJobPayment("jobPayment");

    public final NumberPath<java.math.BigDecimal> mainTaxes = createNumber("mainTaxes", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalJobPayment = createNumber("totalJobPayment", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalPayedSalary = createNumber("totalPayedSalary", java.math.BigDecimal.class);

    public QJobPayment(String variable) {
        super(JobPayment.class, forVariable(variable));
    }

    public QJobPayment(Path<? extends JobPayment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJobPayment(PathMetadata metadata) {
        super(JobPayment.class, metadata);
    }

}

