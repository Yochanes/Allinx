package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* JADX INFO: renamed from: com.google.firebase.concurrent.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4624h implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42781a;

    public /* synthetic */ C4624h(int i) {
        this.f42781a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f42781a) {
            case 0:
                return ExecutorsRegistrar.m15142g(componentContainer);
            case 1:
                return ExecutorsRegistrar.m15140e(componentContainer);
            case 2:
                return ExecutorsRegistrar.m15136a(componentContainer);
            case 3:
                return ExecutorsRegistrar.m15139d(componentContainer);
            case 4:
                return FirebaseInstallationsRegistrar.m15222a(componentContainer);
            case 5:
                return DefaultUserAgentPublisher.m15258a(componentContainer);
            case 6:
                return TransportRegistrar.m15206c(componentContainer);
            case 7:
                return TransportRegistrar.m15205b(componentContainer);
            default:
                return TransportRegistrar.m15204a(componentContainer);
        }
    }
}
