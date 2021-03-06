/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GlobalSchedules;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Schedule;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.RetargetScheduleProperties;

class GlobalSchedulesImpl extends GroupableResourcesCoreImpl<Schedule, ScheduleImpl, ScheduleInner, GlobalSchedulesInner, DevTestLabsManager>  implements GlobalSchedules {
    protected GlobalSchedulesImpl(DevTestLabsManager manager) {
        super(manager.inner().globalSchedules(), manager);
    }

    @Override
    protected Observable<ScheduleInner> getInnerAsync(String resourceGroupName, String name) {
        GlobalSchedulesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        GlobalSchedulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Schedule> listByResourceGroup(String resourceGroupName) {
        GlobalSchedulesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Schedule> listByResourceGroupAsync(String resourceGroupName) {
        GlobalSchedulesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ScheduleInner>, Iterable<ScheduleInner>>() {
            @Override
            public Iterable<ScheduleInner> call(Page<ScheduleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ScheduleInner, Schedule>() {
            @Override
            public Schedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Schedule> list() {
        GlobalSchedulesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Schedule> listAsync() {
        GlobalSchedulesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ScheduleInner>, Iterable<ScheduleInner>>() {
            @Override
            public Iterable<ScheduleInner> call(Page<ScheduleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ScheduleInner, Schedule>() {
            @Override
            public Schedule call(ScheduleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ScheduleImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable executeAsync(String resourceGroupName, String name) {
        GlobalSchedulesInner client = this.inner();
        return client.executeAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Completable retargetAsync(String resourceGroupName, String name, RetargetScheduleProperties retargetScheduleProperties) {
        GlobalSchedulesInner client = this.inner();
        return client.retargetAsync(resourceGroupName, name, retargetScheduleProperties).toCompletable();
    }

    @Override
    protected ScheduleImpl wrapModel(ScheduleInner inner) {
        return  new ScheduleImpl(inner.name(), inner, manager());
    }

    @Override
    protected ScheduleImpl wrapModel(String name) {
        return new ScheduleImpl(name, new ScheduleInner(), this.manager());
    }

}
