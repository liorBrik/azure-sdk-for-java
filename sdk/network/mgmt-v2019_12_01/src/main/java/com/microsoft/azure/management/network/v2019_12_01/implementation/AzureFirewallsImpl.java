/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_12_01.AzureFirewalls;
import com.microsoft.azure.management.network.v2019_12_01.AzureFirewall;
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

class AzureFirewallsImpl extends GroupableResourcesCoreImpl<AzureFirewall, AzureFirewallImpl, AzureFirewallInner, AzureFirewallsInner, NetworkManager>  implements AzureFirewalls {
    protected AzureFirewallsImpl(NetworkManager manager) {
        super(manager.inner().azureFirewalls(), manager);
    }

    @Override
    protected Observable<AzureFirewallInner> getInnerAsync(String resourceGroupName, String name) {
        AzureFirewallsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AzureFirewallsInner client = this.inner();
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
    public PagedList<AzureFirewall> listByResourceGroup(String resourceGroupName) {
        AzureFirewallsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<AzureFirewall> listByResourceGroupAsync(String resourceGroupName) {
        AzureFirewallsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AzureFirewallInner>, Iterable<AzureFirewallInner>>() {
            @Override
            public Iterable<AzureFirewallInner> call(Page<AzureFirewallInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AzureFirewallInner, AzureFirewall>() {
            @Override
            public AzureFirewall call(AzureFirewallInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<AzureFirewall> list() {
        AzureFirewallsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<AzureFirewall> listAsync() {
        AzureFirewallsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AzureFirewallInner>, Iterable<AzureFirewallInner>>() {
            @Override
            public Iterable<AzureFirewallInner> call(Page<AzureFirewallInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AzureFirewallInner, AzureFirewall>() {
            @Override
            public AzureFirewall call(AzureFirewallInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public AzureFirewallImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected AzureFirewallImpl wrapModel(AzureFirewallInner inner) {
        return  new AzureFirewallImpl(inner.name(), inner, manager());
    }

    @Override
    protected AzureFirewallImpl wrapModel(String name) {
        return new AzureFirewallImpl(name, new AzureFirewallInner(), this.manager());
    }

}
