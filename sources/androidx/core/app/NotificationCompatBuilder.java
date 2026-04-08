package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.exchange.allin.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* JADX INFO: renamed from: a */
    public final Context f23053a;

    /* JADX INFO: renamed from: b */
    public final Notification.Builder f23054b;

    /* JADX INFO: renamed from: c */
    public final NotificationCompat.Builder f23055c;

    /* JADX INFO: renamed from: d */
    public final Bundle f23056d;

    /* JADX INFO: renamed from: e */
    public final int f23057e;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api20Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
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
        /* JADX INFO: renamed from: a */
        public static Notification.Builder m7453a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* JADX INFO: renamed from: b */
        public static void m7454b(Notification.Builder builder) {
            builder.setBadgeIconType(0);
        }

        /* JADX INFO: renamed from: c */
        public static void m7455c(Notification.Builder builder, int i) {
            builder.setGroupAlertBehavior(i);
        }

        /* JADX INFO: renamed from: d */
        public static void m7456d(Notification.Builder builder) {
            builder.setSettingsText(null);
        }

        /* JADX INFO: renamed from: e */
        public static void m7457e(Notification.Builder builder, String str) {
            builder.setShortcutId(str);
        }

        /* JADX INFO: renamed from: f */
        public static void m7458f(Notification.Builder builder) {
            builder.setTimeoutAfter(0L);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static void m7459a(Notification.Builder builder, android.app.Person person) {
            builder.addPerson(person);
        }

        /* JADX INFO: renamed from: b */
        public static void m7460b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static void m7461a(Notification.Builder builder, boolean z2) {
            builder.setAllowSystemGeneratedContextualActions(z2);
        }

        /* JADX INFO: renamed from: b */
        public static void m7462b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            builder.setBubbleMetadata(bubbleMetadata);
        }

        /* JADX INFO: renamed from: c */
        public static void m7463c(Notification.Action.Builder builder, boolean z2) {
            builder.setContextual(z2);
        }

        /* JADX INFO: renamed from: d */
        public static void m7464d(Notification.Builder builder, Object obj) {
            builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
        /* JADX INFO: renamed from: a */
        public static void m7465a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x042c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        ArrayList<Person> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Bundle[] bundleArr;
        ArrayList arrayList4;
        new ArrayList();
        this.f23056d = new Bundle();
        this.f23055c = builder;
        Context context = builder.f23010a;
        this.f23053a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23054b = Api26Impl.m7453a(context, builder.f23032w);
        } else {
            this.f23054b = new Notification.Builder(builder.f23010a);
        }
        Notification notification = builder.f23007B;
        int i = 0;
        this.f23054b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.f23014e).setContentText(builder.f23015f).setContentInfo(null).setContentIntent(builder.f23016g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0).setNumber(builder.f23018i).setProgress(builder.f23023n, builder.f23024o, builder.f23025p);
        Notification.Builder builder2 = this.f23054b;
        IconCompat iconCompat = builder.f23017h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.m7619i(context));
        this.f23054b.setSubText(builder.f23022m).setUsesChronometer(false).setPriority(builder.f23019j);
        NotificationCompat.Style style = builder.f23021l;
        if (style instanceof NotificationCompat.CallStyle) {
            NotificationCompat.CallStyle callStyle = (NotificationCompat.CallStyle) style;
            int color = callStyle.f23047a.f23010a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) callStyle.f23047a.f23010a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            NotificationCompat.Action actionM7418a = new NotificationCompat.Action.Builder(IconCompat.m7613c(callStyle.f23047a.f23010a, R.drawable.ic_call_decline), spannableStringBuilder, null).m7418a();
            actionM7418a.f22980a.putBoolean("key_action_priority", true);
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(actionM7418a);
            ArrayList<NotificationCompat.Action> arrayList6 = callStyle.f23047a.f23011b;
            if (arrayList6 != null) {
                int i2 = 2;
                for (NotificationCompat.Action action : arrayList6) {
                    if (action.f22985f) {
                        arrayList5.add(action);
                    } else if (!action.f22980a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList5.add(action);
                        i2--;
                    }
                }
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                m7452b((NotificationCompat.Action) it.next());
            }
        } else {
            Iterator it2 = builder.f23011b.iterator();
            while (it2.hasNext()) {
                m7452b((NotificationCompat.Action) it2.next());
            }
        }
        Bundle bundle = builder.f23029t;
        if (bundle != null) {
            this.f23056d.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f23054b.setShowWhen(builder.f23020k);
        this.f23054b.setLocalOnly(builder.f23028s);
        this.f23054b.setGroup(builder.f23026q);
        this.f23054b.setSortKey(null);
        this.f23054b.setGroupSummary(builder.f23027r);
        this.f23057e = 0;
        this.f23054b.setCategory(null);
        this.f23054b.setColor(builder.f23030u);
        this.f23054b.setVisibility(builder.f23031v);
        this.f23054b.setPublicVersion(null);
        this.f23054b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList7 = builder.f23009D;
        ArrayList<Person> arrayList8 = builder.f23012c;
        if (i3 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList8.size());
                for (Person person : arrayList8) {
                    String str = person.f23081c;
                    if (str == null) {
                        String str2 = person.f23079a;
                        str = str2 != null ? "name:" + ((Object) str2) : "";
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    ArraySet arraySet = new ArraySet(arrayList7.size() + arrayList4.size());
                    arraySet.addAll(arrayList4);
                    arraySet.addAll(arrayList7);
                    arrayList7 = new ArrayList(arraySet);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                this.f23054b.addPerson((String) it3.next());
            }
        }
        ArrayList arrayList9 = builder.f23013d;
        if (arrayList9.size() > 0) {
            if (builder.f23029t == null) {
                builder.f23029t = new Bundle();
            }
            Bundle bundle2 = builder.f23029t.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList9.size()) {
                String string = Integer.toString(i4);
                NotificationCompat.Action action2 = (NotificationCompat.Action) arrayList9.get(i4);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatM7417a = action2.m7417a();
                bundle5.putInt("icon", iconCompatM7417a != null ? iconCompatM7417a.m7615e() : i);
                bundle5.putCharSequence("title", action2.f22987h);
                bundle5.putParcelable("actionIntent", action2.f22988i);
                Bundle bundle6 = action2.f22980a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action2.f22983d);
                bundle5.putBundle("extras", bundle7);
                RemoteInput[] remoteInputArr = action2.f22982c;
                if (remoteInputArr == null) {
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[remoteInputArr.length];
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    int i5 = 0;
                    while (i5 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i5];
                        int i6 = i5;
                        Bundle bundle8 = new Bundle();
                        RemoteInput[] remoteInputArr2 = remoteInputArr;
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle8.putString("resultKey", remoteInput.f23098a);
                        bundle8.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, remoteInput.f23099b);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", remoteInput.f23100c);
                        bundle8.putBundle("extras", remoteInput.f23101d);
                        HashSet hashSet = remoteInput.f23102e;
                        if (hashSet != null && !hashSet.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList10.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr3[i6] = bundle8;
                        i5 = i6 + 1;
                        remoteInputArr = remoteInputArr2;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", action2.f22984e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
                i4++;
                arrayList9 = arrayList2;
                arrayList8 = arrayList3;
                i = 0;
            }
            arrayList = arrayList8;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (builder.f23029t == null) {
                builder.f23029t = new Bundle();
            }
            builder.f23029t.putBundle("android.car.EXTENSIONS", bundle2);
            this.f23056d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            arrayList = arrayList8;
        }
        int i7 = Build.VERSION.SDK_INT;
        this.f23054b.setExtras(builder.f23029t);
        this.f23054b.setRemoteInputHistory(null);
        if (i7 >= 26) {
            Api26Impl.m7454b(this.f23054b);
            Api26Impl.m7456d(this.f23054b);
            Api26Impl.m7457e(this.f23054b, builder.f23033x);
            Api26Impl.m7458f(this.f23054b);
            Api26Impl.m7455c(this.f23054b, 0);
            if (!TextUtils.isEmpty(builder.f23032w)) {
                this.f23054b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            for (Person person2 : arrayList) {
                Notification.Builder builder3 = this.f23054b;
                person2.getClass();
                Api28Impl.m7459a(builder3, Person.Api28Impl.m7474a(person2));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            Api29Impl.m7461a(this.f23054b, builder.f23035z);
            Notification.Builder builder4 = this.f23054b;
            NotificationCompat.BubbleMetadata bubbleMetadata = builder.f23006A;
            if (bubbleMetadata != null) {
                Notification.BubbleMetadata bubbleMetadataM7426a = i8 >= 30 ? NotificationCompat.BubbleMetadata.Api30Impl.m7426a(bubbleMetadata) : i8 == 29 ? NotificationCompat.BubbleMetadata.Api29Impl.m7425a(bubbleMetadata) : null;
                Api29Impl.m7462b(builder4, bubbleMetadataM7426a);
                LocusIdCompat locusIdCompat = builder.f23034y;
                if (locusIdCompat != null) {
                    Api29Impl.m7464d(this.f23054b, locusIdCompat.f23122b);
                }
            }
        }
        if (builder.f23008C) {
            if (this.f23055c.f23027r) {
                this.f23057e = 2;
            } else {
                this.f23057e = 1;
            }
            this.f23054b.setVibrate(null);
            this.f23054b.setSound(null);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            this.f23054b.setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(this.f23055c.f23026q)) {
                    this.f23054b.setGroup("silent");
                }
                Api26Impl.m7455c(this.f23054b, this.f23057e);
            }
        }
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    /* JADX INFO: renamed from: a */
    public final Notification.Builder mo7407a() {
        return this.f23054b;
    }

    /* JADX INFO: renamed from: b */
    public final void m7452b(NotificationCompat.Action action) {
        HashSet hashSet;
        IconCompat iconCompatM7417a = action.m7417a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatM7417a != null ? iconCompatM7417a.m7619i(null) : null, action.f22987h, action.f22988i);
        RemoteInput[] remoteInputArr = action.f22982c;
        if (remoteInputArr != null) {
            android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
            for (int i = 0; i < remoteInputArr.length; i++) {
                RemoteInput remoteInput = remoteInputArr[i];
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(remoteInput.f23098a).setLabel(remoteInput.f23099b).setChoices(null).setAllowFreeFormInput(remoteInput.f23100c).addExtras(remoteInput.f23101d);
                if (Build.VERSION.SDK_INT >= 26 && (hashSet = remoteInput.f23102e) != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        RemoteInput.Api26Impl.m7476a(builderAddExtras, (String) it.next());
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    RemoteInput.Api29Impl.m7477a(builderAddExtras);
                }
                remoteInputArr2[i] = builderAddExtras.build();
            }
            for (android.app.RemoteInput remoteInput2 : remoteInputArr2) {
                builder.addRemoteInput(remoteInput2);
            }
        }
        Bundle bundle = action.f22980a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z2 = action.f22983d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
        int i2 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z2);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i2 >= 28) {
            Api28Impl.m7460b(builder);
        }
        if (i2 >= 29) {
            Api29Impl.m7463c(builder, action.f22985f);
        }
        if (i2 >= 31) {
            Api31Impl.m7465a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", action.f22984e);
        builder.addExtras(bundle2);
        this.f23054b.addAction(builder.build());
    }
}
