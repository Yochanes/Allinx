package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi
public class TypefaceEmojiRasterizer {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f24342d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f24343a;

    /* JADX INFO: renamed from: b */
    public final MetadataRepo f24344b;

    /* JADX INFO: renamed from: c */
    public volatile int f24345c = 0;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i) {
        this.f24344b = metadataRepo;
        this.f24343a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m8815a(int i) {
        MetadataItem metadataItemM8816b = m8816b();
        int iM8830a = metadataItemM8816b.m8830a(16);
        if (iM8830a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = metadataItemM8816b.f24373b;
        int i2 = iM8830a + metadataItemM8816b.f24372a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final MetadataItem m8816b() {
        ThreadLocal threadLocal = f24342d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        MetadataList metadataList = this.f24344b.f24332a;
        int iM8830a = metadataList.m8830a(6);
        if (iM8830a != 0) {
            int i = iM8830a + metadataList.f24372a;
            int i2 = (this.f24343a * 4) + metadataList.f24373b.getInt(i) + i + 4;
            int i3 = metadataList.f24373b.getInt(i2) + i2;
            ByteBuffer byteBuffer = metadataList.f24373b;
            metadataItem.f24373b = byteBuffer;
            if (byteBuffer != null) {
                metadataItem.f24372a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                metadataItem.f24374c = i4;
                metadataItem.f24375d = metadataItem.f24373b.getShort(i4);
                return metadataItem;
            }
            metadataItem.f24372a = 0;
            metadataItem.f24374c = 0;
            metadataItem.f24375d = 0;
        }
        return metadataItem;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        MetadataItem metadataItemM8816b = m8816b();
        int iM8830a = metadataItemM8816b.m8830a(4);
        sb.append(Integer.toHexString(iM8830a != 0 ? metadataItemM8816b.f24373b.getInt(iM8830a + metadataItemM8816b.f24372a) : 0));
        sb.append(", codepoints:");
        MetadataItem metadataItemM8816b2 = m8816b();
        int iM8830a2 = metadataItemM8816b2.m8830a(16);
        if (iM8830a2 != 0) {
            int i2 = iM8830a2 + metadataItemM8816b2.f24372a;
            i = metadataItemM8816b2.f24373b.getInt(metadataItemM8816b2.f24373b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m8815a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
