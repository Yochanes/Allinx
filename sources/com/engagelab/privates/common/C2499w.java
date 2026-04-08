package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.FileUtils;
import com.engagelab.privates.common.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.engagelab.privates.common.w */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2499w {

    /* JADX INFO: renamed from: a */
    public static Queue<C2493u> f35168a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m13153a(Context context, String str, ArrayList<C2493u> arrayList) {
        MTCommonLog.m13010d("MsgQueueUtils", "Action - saveObjects");
        if (context == null) {
            MTCommonLog.m13013w("MsgQueueUtils", "unexcepted , context is null");
            return;
        }
        if (arrayList == null) {
            MTCommonLog.m13013w("MsgQueueUtils", "mObjectList is null");
            return;
        }
        try {
            File file = new File(context.getFilesDir(), str);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < arrayList.size(); i++) {
                jSONArray.put(arrayList.get(i).m13120a());
            }
            FileUtils.save(file.getAbsolutePath(), jSONArray.toString());
        } catch (Throwable th) {
            MTCommonLog.m13012i("MsgQueueUtils", "save Objects  error:" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m13155b(Context context, String str) {
        if (context == null) {
            MTCommonLog.m13013w("MsgQueueUtils", "unexcepted , context is null");
            return;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            MTCommonLog.m13013w("MsgQueueUtils", "can't get files dir");
            return;
        }
        File file = new File(filesDir, str);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized ArrayList<C2493u> m13152a(Context context, String str) {
        FileInputStream fileInputStream = null;
        if (context == null) {
            MTCommonLog.m13013w("MsgQueueUtils", "unexcepted , context is null");
            return null;
        }
        ArrayList<C2493u> arrayList = new ArrayList<>();
        try {
            File file = new File(context.getFilesDir(), str);
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    JSONArray jSONArray = new JSONArray(new String(Utils.readAvailable(fileInputStream2)));
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(C2493u.m13119a(jSONArray.getJSONObject(i)));
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        MTCommonLog.m13013w("MsgQueueUtils", "load objects error:" + th.getMessage());
                        m13155b(context, str);
                    } finally {
                        Utils.closeQuietly(fileInputStream);
                    }
                }
            }
            Utils.closeQuietly(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13154a(Context context, C2493u c2493u) {
        if (f35168a == null) {
            f35168a = new ConcurrentLinkedQueue();
            try {
                ArrayList<C2493u> arrayListM13152a = m13152a(context, "msg_queue_v350_privates");
                if (arrayListM13152a != null && !arrayListM13152a.isEmpty()) {
                    Iterator<C2493u> it = arrayListM13152a.iterator();
                    while (it.hasNext()) {
                        f35168a.offer(it.next());
                    }
                }
            } catch (Exception e) {
                MTCommonLog.m13012i("MsgQueueUtils", "init lastMsgQueue failed:" + e.getMessage());
            }
        }
        if (context == null) {
            MTCommonLog.m13012i("MsgQueueUtils", "#unexcepted - context was null");
            return false;
        }
        if (c2493u == null) {
            MTCommonLog.m13012i("MsgQueueUtils", "#unexcepted - entityKey was null");
        }
        if (f35168a.contains(c2493u)) {
            MTCommonLog.m13011e("MsgQueueUtils", "Duplicated msg. Give up processing - " + c2493u);
            return true;
        }
        if (f35168a.size() >= 200) {
            f35168a.poll();
        }
        f35168a.offer(c2493u);
        try {
            ArrayList<C2493u> arrayListM13152a2 = m13152a(context, "msg_queue_v350_privates");
            if (arrayListM13152a2 == null) {
                arrayListM13152a2 = new ArrayList<>();
            }
            if (arrayListM13152a2.size() >= 50) {
                arrayListM13152a2.remove(0);
            }
            arrayListM13152a2.add(c2493u);
            m13153a(context, "msg_queue_v350_privates", arrayListM13152a2);
        } catch (Exception e2) {
            MTCommonLog.m13012i("MsgQueueUtils", "msg save in sp failed:" + e2.getMessage());
        }
        return false;
    }
}
