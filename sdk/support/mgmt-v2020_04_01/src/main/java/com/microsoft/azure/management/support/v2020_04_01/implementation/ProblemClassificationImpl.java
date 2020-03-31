/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import com.microsoft.azure.management.support.v2020_04_01.ProblemClassification;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class ProblemClassificationImpl extends IndexableRefreshableWrapperImpl<ProblemClassification, ProblemClassificationInner> implements ProblemClassification {
    private final SupportManager manager;
    private String serviceName;
    private String problemClassificationName;

    ProblemClassificationImpl(ProblemClassificationInner inner,  SupportManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "services");
        this.problemClassificationName = IdParsingUtils.getValueFromIdByName(inner.id(), "problemClassifications");
    }

    @Override
    public SupportManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProblemClassificationInner> getInnerAsync() {
        ProblemClassificationsInner client = this.manager().inner().problemClassifications();
        return client.getAsync(this.serviceName, this.problemClassificationName);
    }



    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}