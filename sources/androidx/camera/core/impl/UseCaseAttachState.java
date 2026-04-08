package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class UseCaseAttachState {

    /* JADX INFO: renamed from: a */
    public final String f2803a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f2804b = new LinkedHashMap();

    /* JADX INFO: compiled from: Proguard */
    public interface AttachStateFilter {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UseCaseAttachInfo {

        /* JADX INFO: renamed from: a */
        public final SessionConfig f2805a;

        /* JADX INFO: renamed from: b */
        public final UseCaseConfig f2806b;

        /* JADX INFO: renamed from: c */
        public boolean f2807c = false;

        /* JADX INFO: renamed from: d */
        public boolean f2808d = false;

        public UseCaseAttachInfo(SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
            this.f2805a = sessionConfig;
            this.f2806b = useCaseConfig;
        }
    }

    public UseCaseAttachState(String str) {
        this.f2803a = str;
    }

    /* JADX INFO: renamed from: a */
    public final SessionConfig.ValidatingBuilder m1556a() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2804b.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) entry.getValue();
            if (useCaseAttachInfo.f2808d && useCaseAttachInfo.f2807c) {
                String str = (String) entry.getKey();
                validatingBuilder.m1539a(useCaseAttachInfo.f2805a);
                arrayList.add(str);
            }
        }
        Logger.m1280a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2803a);
        return validatingBuilder;
    }

    /* JADX INFO: renamed from: b */
    public final Collection m1557b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2804b.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) entry.getValue();
            if (useCaseAttachInfo.f2808d && useCaseAttachInfo.f2807c) {
                arrayList.add(((UseCaseAttachInfo) entry.getValue()).f2805a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final SessionConfig.ValidatingBuilder m1558c() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2804b.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) entry.getValue();
            if (useCaseAttachInfo.f2807c) {
                validatingBuilder.m1539a(useCaseAttachInfo.f2805a);
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.m1280a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2803a);
        return validatingBuilder;
    }

    /* JADX INFO: renamed from: d */
    public final Collection m1559d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2804b.entrySet()) {
            if (((UseCaseAttachInfo) entry.getValue()).f2807c) {
                arrayList.add(((UseCaseAttachInfo) entry.getValue()).f2805a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final Collection m1560e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f2804b.entrySet()) {
            if (((UseCaseAttachInfo) entry.getValue()).f2807c) {
                arrayList.add(((UseCaseAttachInfo) entry.getValue()).f2806b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1561f(String str) {
        LinkedHashMap linkedHashMap = this.f2804b;
        if (linkedHashMap.containsKey(str)) {
            return ((UseCaseAttachInfo) linkedHashMap.get(str)).f2807c;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m1562g(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        LinkedHashMap linkedHashMap = this.f2804b;
        UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) linkedHashMap.get(str);
        if (useCaseAttachInfo == null) {
            useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig, useCaseConfig);
            linkedHashMap.put(str, useCaseAttachInfo);
        }
        useCaseAttachInfo.f2808d = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m1563h(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        LinkedHashMap linkedHashMap = this.f2804b;
        UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) linkedHashMap.get(str);
        if (useCaseAttachInfo == null) {
            useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig, useCaseConfig);
            linkedHashMap.put(str, useCaseAttachInfo);
        }
        useCaseAttachInfo.f2807c = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m1564i(String str) {
        LinkedHashMap linkedHashMap = this.f2804b;
        if (linkedHashMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) linkedHashMap.get(str);
            useCaseAttachInfo.f2807c = false;
            if (useCaseAttachInfo.f2808d) {
                return;
            }
            linkedHashMap.remove(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1565j(String str) {
        LinkedHashMap linkedHashMap = this.f2804b;
        if (linkedHashMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) linkedHashMap.get(str);
            useCaseAttachInfo.f2808d = false;
            if (useCaseAttachInfo.f2807c) {
                return;
            }
            linkedHashMap.remove(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1566k(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        LinkedHashMap linkedHashMap = this.f2804b;
        if (linkedHashMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig, useCaseConfig);
            UseCaseAttachInfo useCaseAttachInfo2 = (UseCaseAttachInfo) linkedHashMap.get(str);
            useCaseAttachInfo.f2807c = useCaseAttachInfo2.f2807c;
            useCaseAttachInfo.f2808d = useCaseAttachInfo2.f2808d;
            linkedHashMap.put(str, useCaseAttachInfo);
        }
    }
}
