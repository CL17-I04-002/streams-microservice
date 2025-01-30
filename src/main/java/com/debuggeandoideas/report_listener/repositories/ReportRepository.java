package com.debuggeandoideas.report_listener.repositories;

import com.debuggeandoideas.report_listener.document.ReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {
}
