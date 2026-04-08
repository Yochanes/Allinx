package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi
public final class MetadataRepo {

    /* JADX INFO: renamed from: a */
    public final MetadataList f24332a;

    /* JADX INFO: renamed from: b */
    public final char[] f24333b;

    /* JADX INFO: renamed from: c */
    public final Node f24334c = new Node(UserMetadata.MAX_ATTRIBUTE_SIZE);

    /* JADX INFO: renamed from: d */
    public final Typeface f24335d;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class Node {

        /* JADX INFO: renamed from: a */
        public final SparseArray f24336a;

        /* JADX INFO: renamed from: b */
        public TypefaceEmojiRasterizer f24337b;

        public Node(int i) {
            this.f24336a = new SparseArray(i);
        }

        /* JADX INFO: renamed from: a */
        public final void m8809a(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            int iM8815a = typefaceEmojiRasterizer.m8815a(i);
            SparseArray sparseArray = this.f24336a;
            Node node = sparseArray == null ? null : (Node) sparseArray.get(iM8815a);
            if (node == null) {
                node = new Node(1);
                sparseArray.put(typefaceEmojiRasterizer.m8815a(i), node);
            }
            if (i2 > i) {
                node.m8809a(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.f24337b = typefaceEmojiRasterizer;
            }
        }
    }

    public MetadataRepo(Typeface typeface, MetadataList metadataList) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f24335d = typeface;
        this.f24332a = metadataList;
        int iM8830a = metadataList.m8830a(6);
        if (iM8830a != 0) {
            int i5 = iM8830a + metadataList.f24372a;
            i = metadataList.f24373b.getInt(metadataList.f24373b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f24333b = new char[i * 2];
        int iM8830a2 = metadataList.m8830a(6);
        if (iM8830a2 != 0) {
            int i6 = iM8830a2 + metadataList.f24372a;
            i2 = metadataList.f24373b.getInt(metadataList.f24373b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i7);
            MetadataItem metadataItemM8816b = typefaceEmojiRasterizer.m8816b();
            int iM8830a3 = metadataItemM8816b.m8830a(4);
            Character.toChars(iM8830a3 != 0 ? metadataItemM8816b.f24373b.getInt(iM8830a3 + metadataItemM8816b.f24372a) : 0, this.f24333b, i7 * 2);
            MetadataItem metadataItemM8816b2 = typefaceEmojiRasterizer.m8816b();
            int iM8830a4 = metadataItemM8816b2.m8830a(16);
            if (iM8830a4 != 0) {
                int i8 = iM8830a4 + metadataItemM8816b2.f24372a;
                i3 = metadataItemM8816b2.f24373b.getInt(metadataItemM8816b2.f24373b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            Preconditions.m7695b(i3 > 0, "invalid metadata codepoint length");
            MetadataItem metadataItemM8816b3 = typefaceEmojiRasterizer.m8816b();
            int iM8830a5 = metadataItemM8816b3.m8830a(16);
            if (iM8830a5 != 0) {
                int i9 = iM8830a5 + metadataItemM8816b3.f24372a;
                i4 = metadataItemM8816b3.f24373b.getInt(metadataItemM8816b3.f24373b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            this.f24334c.m8809a(typefaceEmojiRasterizer, 0, i4 - 1);
        }
    }
}
