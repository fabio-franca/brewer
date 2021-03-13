package com.algaworks.brewer.model.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

	@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE })
	@Retention(RetentionPolicy.RUNTIME)
	@Constraint(validatedBy = {})
	@Pattern(regexp = "([a-zA-Z]{2}\\d{4}])?")
	public @interface SKU {
		
		@OverridesAttribute(constraint = Pattern.class, name = "message")
		String message() default "SKU deve seguir o padrão LLNNNN. Sendo 'L' para letra e 'N' para número.";
		
		Class<?>[] groups() default {};
		Class<? extends Payload>[] payload() default {};
	}
