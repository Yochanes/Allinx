package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id */
    private final int f42899id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f42899id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f42899id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
