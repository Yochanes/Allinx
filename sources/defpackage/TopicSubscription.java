package defpackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mvi.base.IgnoredOnProguard;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m18302d2 = {"LTopicSubscription;", "", FirebaseAnalytics.Param.METHOD, "", "params", "", "id", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getParams", "()Ljava/util/Map;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)LTopicSubscription;", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class TopicSubscription {
    public static final int $stable = 8;

    @Nullable
    private final Integer id;

    @NotNull
    private String method;

    @NotNull
    private final Map<String, Object> params;

    public TopicSubscription(@NotNull String method, @NotNull Map<String, ? extends Object> params, @Nullable Integer num) {
        Intrinsics.m18599g(method, "method");
        Intrinsics.m18599g(params, "params");
        this.method = method;
        this.params = params;
        this.id = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicSubscription copy$default(TopicSubscription topicSubscription, String str, Map map, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topicSubscription.method;
        }
        if ((i & 2) != 0) {
            map = topicSubscription.params;
        }
        if ((i & 4) != 0) {
            num = topicSubscription.id;
        }
        return topicSubscription.copy(str, map, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.params;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @NotNull
    public final TopicSubscription copy(@NotNull String method, @NotNull Map<String, ? extends Object> params, @Nullable Integer id) {
        Intrinsics.m18599g(method, "method");
        Intrinsics.m18599g(params, "params");
        return new TopicSubscription(method, params, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicSubscription)) {
            return false;
        }
        TopicSubscription topicSubscription = (TopicSubscription) other;
        return Intrinsics.m18594b(this.method, topicSubscription.method) && Intrinsics.m18594b(this.params, topicSubscription.params) && Intrinsics.m18594b(this.id, topicSubscription.id);
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = (this.params.hashCode() + (this.method.hashCode() * 31)) * 31;
        Integer num = this.id;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setMethod(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.method = str;
    }

    @NotNull
    public String toString() {
        return "TopicSubscription(method=" + this.method + ", params=" + this.params + ", id=" + this.id + ')';
    }

    public /* synthetic */ TopicSubscription(String str, Map map, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? MapsKt.m18481d() : map, (i & 4) != 0 ? null : num);
    }
}
