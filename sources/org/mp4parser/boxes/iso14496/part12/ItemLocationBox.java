package org.mp4parser.boxes.iso14496.part12;

import androidx.compose.animation.AbstractC0455a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ItemLocationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58614j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58615n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58616o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58617p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58618q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58619r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58620s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58621t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58622u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58623v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58624w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58625x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58626y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58627z;

    /* JADX INFO: compiled from: Proguard */
    public class Extent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return 0 == 0 && 0 == 0 && 0 == 0;
        }

        public final int hashCode() {
            return (((((int) (0 ^ (0 >>> 32))) * 31) + ((int) (0 ^ (0 >>> 32)))) * 31) + ((int) ((0 >>> 32) ^ 0));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Extent{extentOffset=");
            sb.append(0L);
            sb.append(", extentLength=");
            sb.append(0L);
            sb.append(", extentIndex=");
            return AbstractC0455a.m2240o(sb, 0L, '}');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class Item {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return 0 == 0;
        }

        public final int hashCode() {
            return (((((((0 * 31) + 0) * 31) + 0) * 31) + ((int) (0 ^ (0 >>> 32)))) * 31) + 0;
        }

        public final String toString() {
            return "Item{baseOffset=0, itemId=0, constructionMethod=0, dataReferenceIndex=0, extents=" + ((Object) null) + '}';
        }
    }

    static {
        Factory factory = new Factory(ItemLocationBox.class, "ItemLocationBox.java");
        f58614j = factory.m21739e(factory.m21738d("getOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"));
        f58615n = factory.m21739e(factory.m21738d("setOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "offsetSize", "", "void"));
        f58624w = factory.m21739e(factory.m21738d("createItem", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Item"));
        f58625x = factory.m21739e(factory.m21738d("createItem", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "java.nio.ByteBuffer", "bb", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Item"));
        f58626y = factory.m21739e(factory.m21738d("createExtent", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Extent"));
        f58627z = factory.m21739e(factory.m21738d("createExtent", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "java.nio.ByteBuffer", "bb", "", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox$Extent"));
        f58616o = factory.m21739e(factory.m21738d("getLengthSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"));
        f58617p = factory.m21739e(factory.m21738d("setLengthSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "lengthSize", "", "void"));
        f58618q = factory.m21739e(factory.m21738d("getBaseOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"));
        f58619r = factory.m21739e(factory.m21738d("setBaseOffsetSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "baseOffsetSize", "", "void"));
        f58620s = factory.m21739e(factory.m21738d("getIndexSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "int"));
        f58621t = factory.m21739e(factory.m21738d("setIndexSize", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "int", "indexSize", "", "void"));
        f58622u = factory.m21739e(factory.m21738d("getItems", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "", "", "", "java.util.List"));
        f58623v = factory.m21739e(factory.m21738d("setItems", "org.mp4parser.boxes.iso14496.part12.ItemLocationBox", "java.util.List", FirebaseAnalytics.Param.ITEMS, "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put((byte) (((0 << 4) | 0) & 255));
        if (this.f59263d == 1) {
            byteBuffer.put((byte) (((0 << 4) | 0) & 255));
        } else {
            byteBuffer.put((byte) ((0 << 4) & 255));
        }
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
