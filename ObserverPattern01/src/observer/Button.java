package observer;

public class Button {

    public void onClick() {
        if (onClickListener != null)
            // Event 처리
            onClickListener.onClick(this);
    }

    public interface OnClickListener {
        void onClick(Button button);
    }

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

}
