package androidx.paging;

import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m18302d2 = {"Landroidx/paging/PagingDataEvent;", "", "T", "Append", "DropAppend", "DropPrepend", "Prepend", HttpHeaders.REFRESH, "Landroidx/paging/PagingDataEvent$Append;", "Landroidx/paging/PagingDataEvent$DropAppend;", "Landroidx/paging/PagingDataEvent$DropPrepend;", "Landroidx/paging/PagingDataEvent$Prepend;", "Landroidx/paging/PagingDataEvent$Refresh;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class PagingDataEvent<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingDataEvent$Append;", "", "T", "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Append<T> extends PagingDataEvent<T> {

        /* JADX INFO: renamed from: a */
        public final int f31096a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f31097b;

        /* JADX INFO: renamed from: c */
        public final int f31098c;

        /* JADX INFO: renamed from: d */
        public final int f31099d;

        public Append(int i, ArrayList arrayList, int i2, int i3) {
            this.f31096a = i;
            this.f31097b = arrayList;
            this.f31098c = i2;
            this.f31099d = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Append)) {
                return false;
            }
            Append append = (Append) obj;
            return this.f31096a == append.f31096a && this.f31097b.equals(append.f31097b) && this.f31098c == append.f31098c && this.f31099d == append.f31099d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31099d) + Integer.hashCode(this.f31098c) + this.f31097b.hashCode() + Integer.hashCode(this.f31096a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.f31097b;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.f31096a);
            sb.append("\n                    |   first item: ");
            sb.append(CollectionsKt.m18402D(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.m18412M(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.f31098c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.f31099d);
            sb.append("\n                    |)\n                    |");
            return StringsKt.m20432d0(sb.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingDataEvent$DropAppend;", "", "T", "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DropAppend<T> extends PagingDataEvent<T> {

        /* JADX INFO: renamed from: a */
        public final int f31100a;

        /* JADX INFO: renamed from: b */
        public final int f31101b;

        /* JADX INFO: renamed from: c */
        public final int f31102c;

        /* JADX INFO: renamed from: d */
        public final int f31103d;

        public DropAppend(int i, int i2, int i3, int i4) {
            this.f31100a = i;
            this.f31101b = i2;
            this.f31102c = i3;
            this.f31103d = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DropAppend)) {
                return false;
            }
            DropAppend dropAppend = (DropAppend) obj;
            return this.f31100a == dropAppend.f31100a && this.f31101b == dropAppend.f31101b && this.f31102c == dropAppend.f31102c && this.f31103d == dropAppend.f31103d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31103d) + Integer.hashCode(this.f31102c) + Integer.hashCode(this.f31101b) + Integer.hashCode(this.f31100a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i = this.f31101b;
            sb.append(i);
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.f31100a);
            sb.append("\n                    |   dropCount: ");
            sb.append(i);
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.f31102c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.f31103d);
            sb.append("\n                    |)\n                    |");
            return StringsKt.m20432d0(sb.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingDataEvent$DropPrepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DropPrepend<T> extends PagingDataEvent<T> {

        /* JADX INFO: renamed from: a */
        public final int f31104a;

        /* JADX INFO: renamed from: b */
        public final int f31105b;

        /* JADX INFO: renamed from: c */
        public final int f31106c;

        public DropPrepend(int i, int i2, int i3) {
            this.f31104a = i;
            this.f31105b = i2;
            this.f31106c = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DropPrepend)) {
                return false;
            }
            DropPrepend dropPrepend = (DropPrepend) obj;
            return this.f31104a == dropPrepend.f31104a && this.f31105b == dropPrepend.f31105b && this.f31106c == dropPrepend.f31106c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31106c) + Integer.hashCode(this.f31105b) + Integer.hashCode(this.f31104a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i = this.f31104a;
            sb.append(i);
            sb.append(" items (\n                    |   dropCount: ");
            sb.append(i);
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.f31105b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.f31106c);
            sb.append("\n                    |)\n                    |");
            return StringsKt.m20432d0(sb.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingDataEvent$Prepend;", "", "T", "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Prepend<T> extends PagingDataEvent<T> {

        /* JADX INFO: renamed from: a */
        public final ArrayList f31107a;

        /* JADX INFO: renamed from: b */
        public final int f31108b;

        /* JADX INFO: renamed from: c */
        public final int f31109c;

        public Prepend(ArrayList arrayList, int i, int i2) {
            this.f31107a = arrayList;
            this.f31108b = i;
            this.f31109c = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Prepend)) {
                return false;
            }
            Prepend prepend = (Prepend) obj;
            return this.f31107a.equals(prepend.f31107a) && this.f31108b == prepend.f31108b && this.f31109c == prepend.f31109c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31109c) + Integer.hashCode(this.f31108b) + this.f31107a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.f31107a;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.m18402D(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.m18412M(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.f31108b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.f31109c);
            sb.append("\n                    |)\n                    |");
            return StringsKt.m20432d0(sb.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingDataEvent$Refresh;", "", "T", "Landroidx/paging/PagingDataEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Refresh<T> extends PagingDataEvent<T> {

        /* JADX INFO: renamed from: a */
        public final PageStore f31110a;

        /* JADX INFO: renamed from: b */
        public final PlaceholderPaddedList f31111b;

        public Refresh(PageStore pageStore, PlaceholderPaddedList previousList) {
            Intrinsics.m18599g(previousList, "previousList");
            this.f31110a = pageStore;
            this.f31111b = previousList;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Refresh)) {
                return false;
            }
            PageStore pageStore = this.f31110a;
            int i = pageStore.f31058c;
            Refresh refresh = (Refresh) obj;
            PageStore pageStore2 = refresh.f31110a;
            if (i != pageStore2.f31058c || pageStore.f31059d != pageStore2.f31059d) {
                return false;
            }
            int size = pageStore.getSize();
            PageStore pageStore3 = refresh.f31110a;
            if (size != pageStore3.getSize() || pageStore.f31057b != pageStore3.f31057b) {
                return false;
            }
            PlaceholderPaddedList placeholderPaddedList = this.f31111b;
            int f31058c = placeholderPaddedList.getF31058c();
            PlaceholderPaddedList placeholderPaddedList2 = refresh.f31111b;
            return f31058c == placeholderPaddedList2.getF31058c() && placeholderPaddedList.getF31059d() == placeholderPaddedList2.getF31059d() && placeholderPaddedList.getSize() == placeholderPaddedList2.getSize() && placeholderPaddedList.getF31057b() == placeholderPaddedList2.getF31057b();
        }

        public final int hashCode() {
            return this.f31111b.hashCode() + this.f31110a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            PageStore pageStore = this.f31110a;
            sb.append(pageStore.f31058c);
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(pageStore.f31059d);
            sb.append("\n                    |       size: ");
            sb.append(pageStore.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(pageStore.f31057b);
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            PlaceholderPaddedList placeholderPaddedList = this.f31111b;
            sb.append(placeholderPaddedList.getF31058c());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(placeholderPaddedList.getF31059d());
            sb.append("\n                    |       size: ");
            sb.append(placeholderPaddedList.getSize());
            sb.append("\n                    |       dataCount: ");
            sb.append(placeholderPaddedList.getF31057b());
            sb.append("\n                    |   )\n                    |");
            return StringsKt.m20432d0(sb.toString());
        }
    }
}
