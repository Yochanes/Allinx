package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: renamed from: com.google.firebase.platforminfo.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4756a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42871c;

    public /* synthetic */ C4756a(int i, String str, Object obj) {
        this.f42869a = i;
        this.f42870b = str;
        this.f42871c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f42869a) {
            case 0:
                return LibraryVersionComponent.m15259a(this.f42870b, (LibraryVersionComponent.VersionExtractor) this.f42871c, componentContainer);
            default:
                return ComponentMonitor.m15269a(this.f42870b, (Component) this.f42871c, componentContainer);
        }
    }
}
