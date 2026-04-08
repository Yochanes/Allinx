package io.intercom.android.sdk.p041ui.common;

import android.content.Context;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider;", "", "<init>", "()V", "getText", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "StringRes", "ActualString", "Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class StringProvider {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$ActualString;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "string", "", "<init>", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class ActualString extends StringProvider {
        public static final int $stable = 0;

        @NotNull
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActualString(@NotNull String string) {
            super(null);
            Intrinsics.m18599g(string, "string");
            this.string = string;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getString() {
            return this.string;
        }

        @NotNull
        public final ActualString copy(@NotNull String string) {
            Intrinsics.m18599g(string, "string");
            return new ActualString(string);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActualString) && Intrinsics.m18594b(this.string, ((ActualString) other).string);
        }

        @NotNull
        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("ActualString(string="), this.string, ')');
        }
    }

    public /* synthetic */ StringProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Composable
    @NotNull
    public final String getText(@Nullable Composer composer, int i) {
        String string;
        composer.mo4221N(-1160503525);
        if (this instanceof ActualString) {
            string = ((ActualString) this).getString();
        } else {
            if (!(this instanceof StringRes)) {
                throw new NoWhenBranchMatchedException();
            }
            StringRes stringRes = (StringRes) this;
            string = ActualStringOrResKt.parseString((Context) composer.mo4247y(AndroidCompositionLocals_androidKt.f19236b), stringRes.getStringRes(), stringRes.getParams());
        }
        composer.mo4213F();
        return string;
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "Lio/intercom/android/sdk/ui/common/StringProvider;", "stringRes", "", "params", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getStringRes", "()I", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class StringRes extends StringProvider {
        public static final int $stable = 8;

        @NotNull
        private final List<Pair<String, String>> params;
        private final int stringRes;

        public /* synthetic */ StringRes(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? EmptyList.f51496a : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringRes.stringRes;
            }
            if ((i2 & 2) != 0) {
                list = stringRes.params;
            }
            return stringRes.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStringRes() {
            return this.stringRes;
        }

        @NotNull
        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        @NotNull
        public final StringRes copy(@androidx.annotation.StringRes int stringRes, @NotNull List<Pair<String, String>> params) {
            Intrinsics.m18599g(params, "params");
            return new StringRes(stringRes, params);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringRes)) {
                return false;
            }
            StringRes stringRes = (StringRes) other;
            return this.stringRes == stringRes.stringRes && Intrinsics.m18594b(this.params, stringRes.params);
        }

        @NotNull
        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return this.params.hashCode() + (Integer.hashCode(this.stringRes) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("StringRes(stringRes=");
            sb.append(this.stringRes);
            sb.append(", params=");
            return AbstractC0455a.m2242q(sb, this.params, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringRes(@androidx.annotation.StringRes int i, @NotNull List<Pair<String, String>> params) {
            super(null);
            Intrinsics.m18599g(params, "params");
            this.stringRes = i;
            this.params = params;
        }
    }

    private StringProvider() {
    }
}
