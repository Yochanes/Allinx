package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class GaplessInfoHolder {

    /* JADX INFO: renamed from: c */
    public static final Pattern f28230c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f28231a = -1;

    /* JADX INFO: renamed from: b */
    public int f28232b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m10811a(String str) {
        Matcher matcher = f28230c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = Util.f25665a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f28231a = i2;
            this.f28232b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10812b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f25311a;
            if (i >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f28499c) && m10811a(commentFrame.f28500d)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f28512b) && "iTunSMPB".equals(internalFrame.f28513c) && m10811a(internalFrame.f28514d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
