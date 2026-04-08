package io.intercom.android.nexus;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NexusEventType {
    private static final /* synthetic */ NexusEventType[] $VALUES;
    public static final NexusEventType AdminIsTyping;
    public static final NexusEventType AdminIsTypingANote;
    public static final NexusEventType ConversationAssigned;
    public static final NexusEventType ConversationClosed;
    public static final NexusEventType ConversationPartToken;
    public static final NexusEventType ConversationReopened;
    public static final NexusEventType ConversationSeen;
    public static final NexusEventType NewComment;
    public static final NexusEventType NewContent;
    public static final NexusEventType NewNote;
    public static final NexusEventType Ping;
    public static final NexusEventType Subscribe;
    public static final NexusEventType ThreadAssigned;
    public static final NexusEventType ThreadClosed;
    public static final NexusEventType ThreadCreated;
    public static final NexusEventType ThreadReopened;
    public static final NexusEventType ThreadUpdated;
    public static final NexusEventType UNKNOWN;
    public static final NexusEventType Unsubscribe;
    public static final NexusEventType UserContentSeenByAdmin;
    public static final NexusEventType UserIsTyping;
    public static final NexusEventType UserPresence;

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50721 extends NexusEventType {
        public C50721(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$10 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507310 extends NexusEventType {
        public C507310(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$11 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507411 extends NexusEventType {
        public C507411(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("eventGuid", UUID.randomUUID().toString());
            jSONObject.put("eventName", "nx." + name());
            jSONObject.put("eventData", jSONObject2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$12 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507512 extends NexusEventType {
        public C507512(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("eventGuid", UUID.randomUUID().toString());
            jSONObject.put("eventName", "nx." + name());
            jSONObject.put("eventData", jSONObject2);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$13 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507613 extends NexusEventType {
        public C507613(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$14 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507714 extends NexusEventType {
        public C507714(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("eventName", "nx." + name());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$15 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507815 extends NexusEventType {
        public C507815(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("eventName", "nx." + name());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$16 */
    /* JADX INFO: compiled from: Proguard */
    public enum C507916 extends NexusEventType {
        public C507916(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("eventData");
            jSONObjectOptJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            jSONObjectOptJSONObject.put("assigneeId", nexusEvent.getEventData().optString("assigneeId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$17 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508017 extends NexusEventType {
        public C508017(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$18 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508118 extends NexusEventType {
        public C508118(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$19 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508219 extends NexusEventType {
        public C508219(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50832 extends NexusEventType {
        public C50832(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$20 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508420 extends NexusEventType {
        public C508420(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$21 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508521 extends NexusEventType {
        public C508521(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject jSONObject = jsonObject.getJSONObject("eventData");
            jSONObject.put("blocks", nexusEvent.getEventData().get("blocks"));
            jSONObject.put("partType", nexusEvent.getEventData().optString("partType"));
            jSONObject.put("clientAssignedUuid", nexusEvent.getEventData().optString("clientAssignedUuid"));
            jSONObject.put("tokenSequenceIndex", nexusEvent.getEventData().optString("tokenSequenceIndex"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$22 */
    /* JADX INFO: compiled from: Proguard */
    public enum C508622 extends NexusEventType {
        public C508622(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public String toStringEncodedJsonObject(NexusEvent nexusEvent) {
            return "";
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50873 extends NexusEventType {
        public C50873(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.FromUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50884 extends NexusEventType {
        public C50884(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.FromUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50895 extends NexusEventType {
        public C50895(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("eventData");
            jSONObjectOptJSONObject.put("adminName", nexusEvent.getEventData().optString("adminName"));
            jSONObjectOptJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            jSONObjectOptJSONObject.put("adminAvatar", nexusEvent.getEventData().optString("adminAvatar"));
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$6 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50906 extends NexusEventType {
        public C50906(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("eventData");
            jSONObjectOptJSONObject.put("adminName", nexusEvent.getEventData().optString("adminName"));
            jSONObjectOptJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            jSONObjectOptJSONObject.put("adminAvatar", nexusEvent.getEventData().optString("adminAvatar"));
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$7 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50917 extends NexusEventType {
        public C50917(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$8 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50928 extends NexusEventType {
        public C50928(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("eventData");
            jSONObjectOptJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            jSONObjectOptJSONObject.put("assigneeId", nexusEvent.getEventData().optString("assigneeId"));
            return jsonObject;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.nexus.NexusEventType$9 */
    /* JADX INFO: compiled from: Proguard */
    public enum C50939 extends NexusEventType {
        public C50939(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.nexus.NexusEventType
        public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    }

    static {
        C50721 c50721 = new C50721("NewComment", 0);
        NewComment = c50721;
        C50832 c50832 = new C50832("NewContent", 1);
        NewContent = c50832;
        C50873 c50873 = new C50873("ConversationSeen", 2);
        ConversationSeen = c50873;
        C50884 c50884 = new C50884("UserIsTyping", 3);
        UserIsTyping = c50884;
        C50895 c50895 = new C50895("AdminIsTyping", 4);
        AdminIsTyping = c50895;
        C50906 c50906 = new C50906("AdminIsTypingANote", 5);
        AdminIsTypingANote = c50906;
        C50917 c50917 = new C50917("NewNote", 6);
        NewNote = c50917;
        C50928 c50928 = new C50928("ConversationAssigned", 7);
        ConversationAssigned = c50928;
        C50939 c50939 = new C50939("ConversationClosed", 8);
        ConversationClosed = c50939;
        C507310 c507310 = new C507310("ConversationReopened", 9);
        ConversationReopened = c507310;
        C507411 c507411 = new C507411("UserPresence", 10);
        UserPresence = c507411;
        C507512 c507512 = new C507512("Ping", 11);
        Ping = c507512;
        C507613 c507613 = new C507613("UserContentSeenByAdmin", 12);
        UserContentSeenByAdmin = c507613;
        C507714 c507714 = new C507714("Subscribe", 13);
        Subscribe = c507714;
        C507815 c507815 = new C507815("Unsubscribe", 14);
        Unsubscribe = c507815;
        C507916 c507916 = new C507916("ThreadAssigned", 15);
        ThreadAssigned = c507916;
        C508017 c508017 = new C508017("ThreadClosed", 16);
        ThreadClosed = c508017;
        C508118 c508118 = new C508118("ThreadReopened", 17);
        ThreadReopened = c508118;
        C508219 c508219 = new C508219("ThreadUpdated", 18);
        ThreadUpdated = c508219;
        C508420 c508420 = new C508420("ThreadCreated", 19);
        ThreadCreated = c508420;
        C508521 c508521 = new C508521("ConversationPartToken", 20);
        ConversationPartToken = c508521;
        C508622 c508622 = new C508622("UNKNOWN", 21);
        UNKNOWN = c508622;
        $VALUES = new NexusEventType[]{c50721, c50832, c50873, c50884, c50895, c50906, c50917, c50928, c50939, c507310, c507411, c507512, c507613, c507714, c507815, c507916, c508017, c508118, c508219, c508420, c508521, c508622};
    }

    private NexusEventType(String str, int i) {
    }

    public static NexusEventType safeValueOf(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    public static NexusEventType valueOf(String str) {
        return (NexusEventType) Enum.valueOf(NexusEventType.class, str);
    }

    public static NexusEventType[] values() {
        return (NexusEventType[]) $VALUES.clone();
    }

    public JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("conversationId", nexusEvent.getEventData().optString("conversationId"));
        jSONObject.put("eventGuid", nexusEvent.getGuid());
        jSONObject.put("eventName", name());
        jSONObject.put("eventData", jSONObject2);
        List<String> topics = nexusEvent.getTopics();
        if (!topics.isEmpty()) {
            jSONObject.put("nx.Topics", new JSONArray((Collection) topics));
        }
        return jSONObject;
    }

    public String toStringEncodedJsonObject(NexusEvent nexusEvent) {
        try {
            return toJsonObject(nexusEvent).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public /* synthetic */ NexusEventType(String str, int i, C50721 c50721) {
        this(str, i);
    }
}
