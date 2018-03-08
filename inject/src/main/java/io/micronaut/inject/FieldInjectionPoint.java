/*
 * Copyright 2017 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.inject;

import io.micronaut.core.type.Argument;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

/**
 * Defines an injection point for a field
 *
 * @param <T> The field component type
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface FieldInjectionPoint<T> extends InjectionPoint, AnnotatedElement {

    /**
     * @return The name of the field
     */
    String getName();

    /**
     * @return The target field
     */
    Field getField();

    /**
     * The required component type
     */
    Class<T> getType();

    /**
     * @return The qualifier
     */
    Annotation getQualifier();

    /**
     * @param object The the field on the target object
     */
    void set(Object object, T instance);

    /**
     * Convert this field to an {@link Argument} reference
     *
     * @return The argument
     */
    Argument<T> asArgument();
}