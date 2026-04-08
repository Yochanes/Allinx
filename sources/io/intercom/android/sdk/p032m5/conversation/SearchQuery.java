package io.intercom.android.sdk.p032m5.conversation;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/SearchQuery;", "", "None", "Query", "Lio/intercom/android/sdk/m5/conversation/SearchQuery$None;", "Lio/intercom/android/sdk/m5/conversation/SearchQuery$Query;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
interface SearchQuery {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/SearchQuery$None;", "Lio/intercom/android/sdk/m5/conversation/SearchQuery;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class None implements SearchQuery {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/SearchQuery$Query;", "Lio/intercom/android/sdk/m5/conversation/SearchQuery;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Query implements SearchQuery {
        public static final int $stable = 0;

        @NotNull
        private final String value;

        public Query(@NotNull String value) {
            Intrinsics.m18599g(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Query copy$default(Query query, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = query.value;
            }
            return query.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Query copy(@NotNull String value) {
            Intrinsics.m18599g(value, "value");
            return new Query(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Query) && Intrinsics.m18594b(this.value, ((Query) other).value);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Query(value="), this.value, ')');
        }
    }
}
