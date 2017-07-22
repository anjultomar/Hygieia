package com.capitalone.dashboard.model;

public enum AuditStatus {
    COMMITAUTHOR_NE_MERGECOMMITER,
    COMMITAUTHOR_EQ_MERGECOMMITER,
    COMMITS_TO_MASTER,
    PULLREQ_REVIEWED_BY_PEER,
    PULLREQ_NOT_PEER_REVIEWED,
    DIRECT_COMMITS_TO_BASE
}