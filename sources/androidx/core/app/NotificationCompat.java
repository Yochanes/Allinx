package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.exchange.allin.R;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class Action {

        /* JADX INFO: renamed from: a */
        public final Bundle f22980a;

        /* JADX INFO: renamed from: b */
        public IconCompat f22981b;

        /* JADX INFO: renamed from: c */
        public final RemoteInput[] f22982c;

        /* JADX INFO: renamed from: d */
        public final boolean f22983d;

        /* JADX INFO: renamed from: e */
        public final boolean f22984e;

        /* JADX INFO: renamed from: f */
        public final boolean f22985f;

        /* JADX INFO: renamed from: g */
        public final int f22986g;

        /* JADX INFO: renamed from: h */
        public final CharSequence f22987h;

        /* JADX INFO: renamed from: i */
        public final PendingIntent f22988i;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {

            /* JADX INFO: renamed from: a */
            public final IconCompat f22989a;

            /* JADX INFO: renamed from: b */
            public final CharSequence f22990b;

            /* JADX INFO: renamed from: c */
            public final PendingIntent f22991c;

            /* JADX INFO: renamed from: d */
            public final boolean f22992d;

            /* JADX INFO: renamed from: e */
            public final Bundle f22993e;

            /* JADX INFO: renamed from: f */
            public ArrayList f22994f;

            /* JADX INFO: renamed from: g */
            public final boolean f22995g;

            /* JADX INFO: renamed from: h */
            public boolean f22996h;

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api20Impl {
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api23Impl {
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api24Impl {
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api28Impl {
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api29Impl {
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api31Impl {
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle());
            }

            /* JADX INFO: renamed from: a */
            public final Action m7418a() {
                HashSet hashSet;
                if (this.f22996h && this.f22991c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.f22994f;
                if (arrayList3 != null) {
                    for (RemoteInput remoteInput : arrayList3) {
                        if (remoteInput.f23100c || (hashSet = remoteInput.f23102e) == null || hashSet.isEmpty()) {
                            arrayList2.add(remoteInput);
                        } else {
                            arrayList.add(remoteInput);
                        }
                    }
                }
                return new Action(this.f22989a, this.f22990b, this.f22991c, this.f22993e, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.f22992d, this.f22995g, this.f22996h);
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
                this.f22992d = true;
                this.f22995g = true;
                this.f22989a = iconCompat;
                this.f22990b = Builder.m7427b(charSequence);
                this.f22991c = pendingIntent;
                this.f22993e = bundle;
                this.f22994f = null;
                this.f22992d = true;
                this.f22995g = true;
                this.f22996h = false;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface Extender {
        }

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class WearableExtender implements Extender {
            public final Object clone() {
                return new WearableExtender();
            }
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z2, boolean z3, boolean z4) {
            this.f22984e = true;
            this.f22981b = iconCompat;
            if (iconCompat != null && iconCompat.m7616f() == 2) {
                this.f22986g = iconCompat.m7615e();
            }
            this.f22987h = Builder.m7427b(charSequence);
            this.f22988i = pendingIntent;
            this.f22980a = bundle == null ? new Bundle() : bundle;
            this.f22982c = remoteInputArr;
            this.f22983d = z2;
            this.f22984e = z3;
            this.f22985f = z4;
        }

        /* JADX INFO: renamed from: a */
        public final IconCompat m7417a() {
            int i;
            if (this.f22981b == null && (i = this.f22986g) != 0) {
                this.f22981b = IconCompat.m7614d(null, "", i);
            }
            return this.f22981b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api20Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BadgeIconType {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BigPictureStyle extends Style {

        /* JADX INFO: renamed from: e */
        public IconCompat f22997e;

        /* JADX INFO: renamed from: f */
        public IconCompat f22998f;

        /* JADX INFO: renamed from: g */
        public boolean f22999g;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api23Impl {
            @RequiresApi
            /* JADX INFO: renamed from: a */
            public static void m7421a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api31Impl {
            @RequiresApi
            /* JADX INFO: renamed from: a */
            public static void m7422a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi
            /* JADX INFO: renamed from: b */
            public static void m7423b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi
            /* JADX INFO: renamed from: c */
            public static void m7424c(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Bitmap bitmapM7611a;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b).setBigContentTitle(this.f23048b);
            IconCompat iconCompat = this.f22997e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.m7422a(bigContentTitle, iconCompat.m7619i(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23053a));
                } else if (iconCompat.m7616f() == 1) {
                    IconCompat iconCompat2 = this.f22997e;
                    int i = iconCompat2.f23229a;
                    if (i == -1) {
                        Object obj = iconCompat2.f23230b;
                        bitmapM7611a = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmapM7611a = (Bitmap) iconCompat2.f23230b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapM7611a = IconCompat.m7611a((Bitmap) iconCompat2.f23230b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapM7611a);
                }
            }
            if (this.f22999g) {
                IconCompat iconCompat3 = this.f22998f;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    Api23Impl.m7421a(bigContentTitle, iconCompat3.m7619i(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23053a));
                }
            }
            if (this.f23050d) {
                bigContentTitle.setSummaryText(this.f23049c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.m7424c(bigContentTitle, false);
                Api31Impl.m7423b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BigTextStyle extends Style {

        /* JADX INFO: renamed from: e */
        public CharSequence f23000e;

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b).setBigContentTitle(this.f23048b).bigText(this.f23000e);
            if (this.f23050d) {
                bigTextStyleBigText.setSummaryText(this.f23049c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BubbleMetadata {

        /* JADX INFO: renamed from: a */
        public PendingIntent f23001a;

        /* JADX INFO: renamed from: b */
        public IconCompat f23002b;

        /* JADX INFO: renamed from: c */
        public int f23003c;

        /* JADX INFO: renamed from: d */
        public int f23004d;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api29Impl {
            @Nullable
            @RequiresApi
            /* JADX INFO: renamed from: a */
            public static Notification.BubbleMetadata m7425a(@Nullable BubbleMetadata bubbleMetadata) {
                PendingIntent pendingIntent;
                if (bubbleMetadata == null || (pendingIntent = bubbleMetadata.f23001a) == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.f23002b.m7619i(null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((bubbleMetadata.f23004d & 1) != 0).setSuppressNotification((bubbleMetadata.f23004d & 2) != 0);
                int i = bubbleMetadata.f23003c;
                if (i != 0) {
                    suppressNotification.setDesiredHeight(i);
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api30Impl {
            @Nullable
            @RequiresApi
            /* JADX INFO: renamed from: a */
            public static Notification.BubbleMetadata m7426a(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(bubbleMetadata.f23001a, bubbleMetadata.f23002b.m7619i(null));
                builder.setDeleteIntent(null).setAutoExpandBubble((bubbleMetadata.f23004d & 1) != 0).setSuppressNotification((bubbleMetadata.f23004d & 2) != 0);
                int i = bubbleMetadata.f23003c;
                if (i != 0) {
                    builder.setDesiredHeight(i);
                }
                return builder.build();
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {

            /* JADX INFO: renamed from: a */
            public int f23005a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: A */
        public BubbleMetadata f23006A;

        /* JADX INFO: renamed from: B */
        public final Notification f23007B;

        /* JADX INFO: renamed from: C */
        public boolean f23008C;

        /* JADX INFO: renamed from: D */
        public final ArrayList f23009D;

        /* JADX INFO: renamed from: a */
        public final Context f23010a;

        /* JADX INFO: renamed from: e */
        public CharSequence f23014e;

        /* JADX INFO: renamed from: f */
        public CharSequence f23015f;

        /* JADX INFO: renamed from: g */
        public PendingIntent f23016g;

        /* JADX INFO: renamed from: h */
        public IconCompat f23017h;

        /* JADX INFO: renamed from: i */
        public int f23018i;

        /* JADX INFO: renamed from: j */
        public int f23019j;

        /* JADX INFO: renamed from: l */
        public Style f23021l;

        /* JADX INFO: renamed from: m */
        public CharSequence f23022m;

        /* JADX INFO: renamed from: n */
        public int f23023n;

        /* JADX INFO: renamed from: o */
        public int f23024o;

        /* JADX INFO: renamed from: p */
        public boolean f23025p;

        /* JADX INFO: renamed from: q */
        public String f23026q;

        /* JADX INFO: renamed from: r */
        public boolean f23027r;

        /* JADX INFO: renamed from: t */
        public Bundle f23029t;

        /* JADX INFO: renamed from: w */
        public String f23032w;

        /* JADX INFO: renamed from: x */
        public String f23033x;

        /* JADX INFO: renamed from: y */
        public LocusIdCompat f23034y;

        /* JADX INFO: renamed from: z */
        public final boolean f23035z;

        /* JADX INFO: renamed from: b */
        public final ArrayList f23011b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final ArrayList f23012c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f23013d = new ArrayList();

        /* JADX INFO: renamed from: k */
        public boolean f23020k = true;

        /* JADX INFO: renamed from: s */
        public boolean f23028s = false;

        /* JADX INFO: renamed from: u */
        public int f23030u = 0;

        /* JADX INFO: renamed from: v */
        public int f23031v = 0;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api21Impl {
            /* JADX INFO: renamed from: a */
            public static AudioAttributes m7433a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* JADX INFO: renamed from: b */
            public static AudioAttributes.Builder m7434b() {
                return new AudioAttributes.Builder();
            }

            /* JADX INFO: renamed from: c */
            public static AudioAttributes.Builder m7435c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            /* JADX INFO: renamed from: d */
            public static AudioAttributes.Builder m7436d(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api23Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
        }

        public Builder(Context context, String str) {
            Notification notification = new Notification();
            this.f23007B = notification;
            this.f23010a = context;
            this.f23032w = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.f23019j = 0;
            this.f23009D = new ArrayList();
            this.f23035z = true;
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m7427b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: a */
        public final Notification m7428a() {
            Notification notificationBuild;
            Bundle bundle;
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Builder builder = notificationCompatBuilder.f23055c;
            Style style = builder.f23021l;
            if (style != null) {
                style.mo7419b(notificationCompatBuilder);
            }
            int i = Build.VERSION.SDK_INT;
            Notification.Builder builder2 = notificationCompatBuilder.f23054b;
            if (i >= 26) {
                notificationBuild = builder2.build();
            } else {
                Notification notificationBuild2 = builder2.build();
                int i2 = notificationCompatBuilder.f23057e;
                if (i2 != 0) {
                    if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i2 == 2) {
                        notificationBuild2.sound = null;
                        notificationBuild2.vibrate = null;
                        notificationBuild2.defaults &= -4;
                    }
                    if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i2 == 1) {
                        notificationBuild2.sound = null;
                        notificationBuild2.vibrate = null;
                        notificationBuild2.defaults &= -4;
                    }
                }
                notificationBuild = notificationBuild2;
            }
            if (style != null) {
                builder.f23021l.getClass();
            }
            if (style != null && (bundle = notificationBuild.extras) != null) {
                style.mo7437a(bundle);
            }
            return notificationBuild;
        }

        /* JADX INFO: renamed from: c */
        public final void m7429c(int i, boolean z2) {
            Notification notification = this.f23007B;
            if (z2) {
                notification.flags = i | notification.flags;
            } else {
                notification.flags = (~i) & notification.flags;
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m7430d(Bitmap bitmap) {
            IconCompat iconCompatM7612b;
            if (bitmap == null) {
                iconCompatM7612b = null;
            } else {
                if (Build.VERSION.SDK_INT < 27) {
                    Resources resources = this.f23010a.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                    if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                        bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                    }
                }
                iconCompatM7612b = IconCompat.m7612b(bitmap);
            }
            this.f23017h = iconCompatM7612b;
        }

        /* JADX INFO: renamed from: e */
        public final void m7431e(Uri uri) {
            Notification notification = this.f23007B;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = Api21Impl.m7433a(Api21Impl.m7436d(Api21Impl.m7435c(Api21Impl.m7434b(), 4), 5));
        }

        /* JADX INFO: renamed from: f */
        public final void m7432f(Style style) {
            if (this.f23021l != style) {
                this.f23021l = style;
                if (style == null || style.f23047a == this) {
                    return;
                }
                style.f23047a = this;
                m7432f(style);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CallStyle extends Style {

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api20Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api21Impl {
            /* JADX INFO: renamed from: a */
            public static Notification.Builder m7438a(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api23Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api28Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api31Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CallType {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: a */
        public final void mo7437a(Bundle bundle) {
            super.mo7437a(bundle);
            bundle.putInt("android.callType", 0);
            bundle.putBoolean("android.callIsVideo", false);
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", null);
            bundle.putParcelable("android.declineIntent", null);
            bundle.putParcelable("android.hangUpIntent", null);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                    return;
                }
                return;
            }
            Notification.Builder builder = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b;
            builder.setContentTitle(null);
            Bundle bundle = this.f23047a.f23029t;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f23047a.f23029t.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            Api21Impl.m7438a(builder, "call");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CarExtender implements Extender {

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api20Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api29Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @Deprecated
        public static class UnreadConversation {

            /* JADX INFO: compiled from: Proguard */
            public static class Builder {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DecoratedCustomViewStyle extends Style {

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
            /* JADX INFO: renamed from: a */
            public static Notification.Style m7439a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b.setStyle(Api24Impl.m7439a());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Extender {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GroupAlertBehavior {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class InboxStyle extends Style {

        /* JADX INFO: renamed from: e */
        public ArrayList f23036e;

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b).setBigContentTitle(this.f23048b);
            if (this.f23050d) {
                bigContentTitle.setSummaryText(this.f23049c);
            }
            Iterator it = this.f23036e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NotificationVisibility {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ServiceNotificationBehavior {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StreamType {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TvExtender implements Extender {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WearableExtender implements Extender {

        /* JADX INFO: renamed from: a */
        public ArrayList f23051a;

        /* JADX INFO: renamed from: b */
        public ArrayList f23052b;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api20Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api23Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api31Impl {
        }

        public final Object clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f23051a = new ArrayList();
            wearableExtender.f23052b = new ArrayList();
            wearableExtender.f23051a = new ArrayList(this.f23051a);
            wearableExtender.f23052b = new ArrayList(this.f23052b);
            return wearableExtender;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MessagingStyle extends Style {

        /* JADX INFO: renamed from: e */
        public final ArrayList f23037e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final ArrayList f23038f = new ArrayList();

        /* JADX INFO: renamed from: g */
        public final Person f23039g;

        /* JADX INFO: renamed from: h */
        public Boolean f23040h;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
            /* JADX INFO: renamed from: a */
            public static Notification.MessagingStyle m7440a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            /* JADX INFO: renamed from: b */
            public static Notification.MessagingStyle m7441b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            /* JADX INFO: renamed from: c */
            public static Notification.MessagingStyle m7442c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api26Impl {
            /* JADX INFO: renamed from: a */
            public static Notification.MessagingStyle m7443a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api28Impl {
            /* JADX INFO: renamed from: a */
            public static Notification.MessagingStyle m7444a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            /* JADX INFO: renamed from: b */
            public static Notification.MessagingStyle m7445b(Notification.MessagingStyle messagingStyle, boolean z2) {
                return messagingStyle.setGroupConversation(z2);
            }
        }

        public MessagingStyle(Person person) {
            if (TextUtils.isEmpty(person.f23079a)) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f23039g = person;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: a */
        public final void mo7437a(Bundle bundle) {
            super.mo7437a(bundle);
            Person person = this.f23039g;
            bundle.putCharSequence("android.selfDisplayName", person.f23079a);
            bundle.putBundle("android.messagingStyleUser", person.m7473b());
            bundle.putCharSequence("android.hiddenConversationTitle", null);
            ArrayList arrayList = this.f23037e;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", Message.m7446a(arrayList));
            }
            ArrayList arrayList2 = this.f23038f;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", Message.m7446a(arrayList2));
            }
            Boolean bool = this.f23040h;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: b */
        public final void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Boolean bool;
            Notification.MessagingStyle messagingStyleM7441b;
            Builder builder = this.f23047a;
            boolean zBooleanValue = false;
            if ((builder == null || builder.f23010a.getApplicationInfo().targetSdkVersion >= 28 || this.f23040h != null) && (bool = this.f23040h) != null) {
                zBooleanValue = bool.booleanValue();
            }
            this.f23040h = Boolean.valueOf(zBooleanValue);
            int i = Build.VERSION.SDK_INT;
            Person person = this.f23039g;
            if (i >= 28) {
                person.getClass();
                messagingStyleM7441b = Api28Impl.m7444a(Person.Api28Impl.m7474a(person));
            } else {
                messagingStyleM7441b = Api24Impl.m7441b(person.f23079a);
            }
            Iterator it = this.f23037e.iterator();
            while (it.hasNext()) {
                Api24Impl.m7440a(messagingStyleM7441b, ((Message) it.next()).m7447b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f23038f.iterator();
                while (it2.hasNext()) {
                    Api26Impl.m7443a(messagingStyleM7441b, ((Message) it2.next()).m7447b());
                }
            }
            if (this.f23040h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.m7442c(messagingStyleM7441b, null);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.m7445b(messagingStyleM7441b, this.f23040h.booleanValue());
            }
            messagingStyleM7441b.setBuilder(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f23054b);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        /* JADX INFO: renamed from: c */
        public final String mo7420c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Message {

            /* JADX INFO: renamed from: a */
            public final String f23041a;

            /* JADX INFO: renamed from: b */
            public final long f23042b;

            /* JADX INFO: renamed from: c */
            public final Person f23043c;

            /* JADX INFO: renamed from: d */
            public final Bundle f23044d = new Bundle();

            /* JADX INFO: renamed from: e */
            public String f23045e;

            /* JADX INFO: renamed from: f */
            public Uri f23046f;

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api24Impl {
                /* JADX INFO: renamed from: a */
                public static Notification.MessagingStyle.Message m7448a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.MessagingStyle.Message m7449b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public Message(String str, long j, Person person) {
                this.f23041a = str;
                this.f23042b = j;
                this.f23043c = person;
            }

            /* JADX INFO: renamed from: a */
            public static Bundle[] m7446a(ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Message message = (Message) arrayList.get(i);
                    message.getClass();
                    Bundle bundle = new Bundle();
                    String str = message.f23041a;
                    if (str != null) {
                        bundle.putCharSequence(AttributeType.TEXT, str);
                    }
                    bundle.putLong("time", message.f23042b);
                    Person person = message.f23043c;
                    if (person != null) {
                        bundle.putCharSequence("sender", person.f23079a);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle.putParcelable("sender_person", Api28Impl.m7450a(Person.Api28Impl.m7474a(person)));
                        } else {
                            bundle.putBundle("person", person.m7473b());
                        }
                    }
                    String str2 = message.f23045e;
                    if (str2 != null) {
                        bundle.putString("type", str2);
                    }
                    Uri uri = message.f23046f;
                    if (uri != null) {
                        bundle.putParcelable("uri", uri);
                    }
                    Bundle bundle2 = message.f23044d;
                    if (bundle2 != null) {
                        bundle.putBundle("extras", bundle2);
                    }
                    bundleArr[i] = bundle;
                }
                return bundleArr;
            }

            /* JADX INFO: renamed from: b */
            public final Notification.MessagingStyle.Message m7447b() {
                Notification.MessagingStyle.Message messageM7448a;
                int i = Build.VERSION.SDK_INT;
                long j = this.f23042b;
                String str = this.f23041a;
                Person person = this.f23043c;
                if (i >= 28) {
                    messageM7448a = Api28Impl.m7451b(str, j, person != null ? Person.Api28Impl.m7474a(person) : null);
                } else {
                    messageM7448a = Api24Impl.m7448a(str, j, person != null ? person.f23079a : null);
                }
                String str2 = this.f23045e;
                if (str2 != null) {
                    Api24Impl.m7449b(messageM7448a, str2, this.f23046f);
                }
                return messageM7448a;
            }

            /* JADX INFO: compiled from: Proguard */
            @RequiresApi
            public static class Api28Impl {
                /* JADX INFO: renamed from: b */
                public static Notification.MessagingStyle.Message m7451b(CharSequence charSequence, long j, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }

                /* JADX INFO: renamed from: a */
                public static Parcelable m7450a(android.app.Person person) {
                    return person;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Style {

        /* JADX INFO: renamed from: a */
        public Builder f23047a;

        /* JADX INFO: renamed from: b */
        public CharSequence f23048b;

        /* JADX INFO: renamed from: c */
        public CharSequence f23049c;

        /* JADX INFO: renamed from: d */
        public boolean f23050d = false;

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api24Impl {
        }

        /* JADX INFO: renamed from: a */
        public void mo7437a(Bundle bundle) {
            if (this.f23050d) {
                bundle.putCharSequence("android.summaryText", this.f23049c);
            }
            CharSequence charSequence = this.f23048b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strMo7420c = mo7420c();
            if (strMo7420c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo7420c);
            }
        }

        /* JADX INFO: renamed from: c */
        public String mo7420c() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void mo7419b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }
    }
}
