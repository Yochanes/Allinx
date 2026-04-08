package com.tinder.scarlet.internal.servicemethod;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;", "", "MessageAdapterKey", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class MessageAdapterResolver {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver$MessageAdapterKey;", "", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class MessageAdapterKey {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!MessageAdapterKey.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
            }
            return Arrays.equals((Object[]) null, (Object[]) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "MessageAdapterKey(type=null, annotations=" + Arrays.toString((Object[]) null) + ")";
        }
    }
}
