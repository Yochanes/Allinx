package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/tinder/scarlet/Deserialization;", "T", "", "Error", "Success", "Lcom/tinder/scarlet/Deserialization$Success;", "Lcom/tinder/scarlet/Deserialization$Error;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class Deserialization<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/Deserialization$Error;", "T", "Lcom/tinder/scarlet/Deserialization;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Error<T> extends Deserialization<T> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            ((Error) obj).getClass();
            return Intrinsics.m18594b(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error(throwable=" + ((Object) null) + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/Deserialization$Success;", "T", "Lcom/tinder/scarlet/Deserialization;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Success<T> extends Deserialization<T> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
