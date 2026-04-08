package io.intercom.android.sdk.models;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Participant extends Participant {
    private final Avatar getAvatar;
    private final String getEmail;
    private final String getId;
    private final String getName;
    private final String getType;
    private final Boolean isBot;

    public AutoValue_Participant(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null getId");
        }
        this.getId = str;
        if (str2 == null) {
            throw new NullPointerException("Null getName");
        }
        this.getName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null getType");
        }
        this.getType = str3;
        if (str4 == null) {
            throw new NullPointerException("Null getEmail");
        }
        this.getEmail = str4;
        if (avatar == null) {
            throw new NullPointerException("Null getAvatar");
        }
        this.getAvatar = avatar;
        if (bool == null) {
            throw new NullPointerException("Null isBot");
        }
        this.isBot = bool;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Participant) {
            Participant participant = (Participant) obj;
            if (this.getId.equals(participant.getId()) && this.getName.equals(participant.getName()) && this.getType.equals(participant.getType()) && this.getEmail.equals(participant.getEmail()) && this.getAvatar.equals(participant.getAvatar()) && this.isBot.equals(participant.isBot())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Avatar getAvatar() {
        return this.getAvatar;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getEmail() {
        return this.getEmail;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getId() {
        return this.getId;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getName() {
        return this.getName;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getType() {
        return this.getType;
    }

    public int hashCode() {
        return ((((((((((this.getId.hashCode() ^ 1000003) * 1000003) ^ this.getName.hashCode()) * 1000003) ^ this.getType.hashCode()) * 1000003) ^ this.getEmail.hashCode()) * 1000003) ^ this.getAvatar.hashCode()) * 1000003) ^ this.isBot.hashCode();
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        return "Participant{getId=" + this.getId + ", getName=" + this.getName + ", getType=" + this.getType + ", getEmail=" + this.getEmail + ", getAvatar=" + this.getAvatar + ", isBot=" + this.isBot + "}";
    }
}
