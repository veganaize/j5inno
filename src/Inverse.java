class Inverse {
    public static String invesre(String text) {
        StringBuilder r = new StringBuilder();
        for (int p = text.length(); p > 0; p = p - 1) {
            r.append(text.charAt(p));
        }
        return r.toString();
    }
}
