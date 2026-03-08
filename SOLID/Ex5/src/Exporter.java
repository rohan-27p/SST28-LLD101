public abstract class Exporter {
     public final ExportResult export(ExportRequest req) {
        if (req == null) {
            throw new IllegalArgumentException("ExportRequest cannot be null");
        }

        String title = req.title == null ? "" : req.title;
        String body = req.body == null ? "" : req.body;

        ExportRequest normalized = new ExportRequest(title, body);

        ExportResult result = doExport(normalized);

        if (result == null || result.bytes == null) {
            throw new IllegalStateException("Exporter returned invalid result");
        }

        return result;
    }

    protected abstract ExportResult doExport(ExportRequest req);
}
