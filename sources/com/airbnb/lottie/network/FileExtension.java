package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");


    /* JADX INFO: renamed from: a */
    public final String f34750a;

    FileExtension(String str) {
        this.f34750a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f34750a;
    }
}
