package com.google.common.eventbus;

/* JADX INFO: renamed from: com.google.common.eventbus.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4385a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subscriber f42627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42628b;

    public /* synthetic */ RunnableC4385a(Object obj, Subscriber subscriber) {
        this.f42627a = subscriber;
        this.f42628b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Subscriber.m14958a(this.f42628b, this.f42627a);
    }
}
