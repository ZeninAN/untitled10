public class Release {
    private Film[] items = new Film[0];
    private int limit = 10;

    public Release() {
    }

    public Release(int limit) {
        this.limit = limit;
    }

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }

    public Film[] getAll() {
        int resultLength = items.length;
        if (resultLength > limit) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}


