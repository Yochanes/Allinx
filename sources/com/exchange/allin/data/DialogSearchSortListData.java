package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00050\u0004HÆ\u0003J+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00050\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m18302d2 = {"Lcom/exchange/allin/data/DialogSearchSortListData;", "T", "Lcom/exchange/allin/data/DialogData;", AttributeType.LIST, "", "Lkotlin/Pair;", "", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class DialogSearchSortListData<T> implements DialogData<T> {
    public static final int $stable = 8;

    @NotNull
    private final List<Pair<String, T>> list;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogSearchSortListData(@NotNull List<? extends Pair<String, ? extends T>> list) {
        Intrinsics.m18599g(list, "list");
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogSearchSortListData copy$default(DialogSearchSortListData dialogSearchSortListData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dialogSearchSortListData.list;
        }
        return dialogSearchSortListData.copy(list);
    }

    @NotNull
    public final List<Pair<String, T>> component1() {
        return this.list;
    }

    @NotNull
    public final DialogSearchSortListData<T> copy(@NotNull List<? extends Pair<String, ? extends T>> list) {
        Intrinsics.m18599g(list, "list");
        return new DialogSearchSortListData<>(list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DialogSearchSortListData) && Intrinsics.m18594b(this.list, ((DialogSearchSortListData) other).list);
    }

    @NotNull
    public final List<Pair<String, T>> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC0455a.m2242q(new StringBuilder("DialogSearchSortListData(list="), this.list, ')');
    }
}
