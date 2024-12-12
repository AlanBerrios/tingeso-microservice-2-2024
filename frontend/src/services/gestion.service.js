import httpClient from "../http-common";

// Clients Service
const createClient = (client) => httpClient.post("/clients", client);
const getClients = () => httpClient.get("/clients");
const getClientByRut = (rut) => httpClient.get(`/clients/${rut}`);
const updateClient = (client) => httpClient.put("/clients", client);
const deleteClient = (id) => httpClient.delete(`/clients/${id}`);

// Credit Evaluations Service
const createCreditEvaluation = (evaluation) => httpClient.post("/credit-evaluations", evaluation);
const getCreditEvaluations = () => httpClient.get("/credit-evaluations");
const getCreditEvaluationById = (id) => httpClient.get(`/credit-evaluations/${id}`);
const updateCreditEvaluation = (evaluation) => httpClient.put("/credit-evaluations", evaluation);
const deleteCreditEvaluation = (id) => httpClient.delete(`/credit-evaluations/${id}`);

// Credit Requests Service
const createCreditRequest = (request) => httpClient.post("/credit-requests", request);
const getCreditRequests = () => httpClient.get("/credit-requests");
const getCreditRequestById = (id) => httpClient.get(`/credit-requests/${id}`);
const updateCreditRequest = (request) => httpClient.put("/credit-requests", request);
const deleteCreditRequest = (id) => httpClient.delete(`/credit-requests/${id}`);

// Debt Service
const getDebtsByClient = (clientId) => httpClient.get(`/debts/client/${clientId}`);
const getDebtById = (id) => httpClient.get(`/debts/${id}`);

// Documentation Service
const uploadDocumentation = (file) => httpClient.post("/documentation/upload", file);
const getDocumentation = (id) => httpClient.get(`/documentation/${id}`);

// Jobs Service
const createJob = (job) => httpClient.post("/jobs", job);
const getJobs = () => httpClient.get("/jobs");
const getJobById = (id) => httpClient.get(`/jobs/${id}`);
const updateJob = (job) => httpClient.put("/jobs", job);
const deleteJob = (id) => httpClient.delete(`/jobs/${id}`);

// Loan Cost Service
const calculateLoanCost = (params) => httpClient.post("/loan-cost/calculate", params);
const getLoanCostById = (id) => httpClient.get(`/loan-cost/${id}`);

// Request Tracking Service
const createRequestTracking = (tracking) => httpClient.post("/request-tracking", tracking);
const getRequestTrackings = () => httpClient.get("/request-tracking");
const getRequestTrackingById = (id) => httpClient.get(`/request-tracking/${id}`);
const updateRequestTracking = (tracking) => httpClient.put("/request-tracking", tracking);
const deleteRequestTracking = (id) => httpClient.delete(`/request-tracking/${id}`);

// Savings Accounts Service
const createSavingsAccount = (account) => httpClient.post("/savings-accounts", account);
const getSavingsAccounts = () => httpClient.get("/savings-accounts");
const getSavingsAccountByRut = (rut) => httpClient.get(`/savings-accounts/${rut}`);
const updateSavingsAccount = (account) => httpClient.put("/savings-accounts", account);
const deleteSavingsAccount = (id) => httpClient.delete(`/savings-accounts/${id}`);

export default {
  // Clients Service
  createClient,
  getClients,
  getClientByRut,
  updateClient,
  deleteClient,

  // Credit Evaluations Service
  createCreditEvaluation,
  getCreditEvaluations,
  getCreditEvaluationById,
  updateCreditEvaluation,
  deleteCreditEvaluation,

  // Credit Requests Service
  createCreditRequest,
  getCreditRequests,
  getCreditRequestById,
  updateCreditRequest,
  deleteCreditRequest,

  // Debt Service
  getDebtsByClient,
  getDebtById,

  // Documentation Service
  uploadDocumentation,
  getDocumentation,

  // Jobs Service
  createJob,
  getJobs,
  getJobById,
  updateJob,
  deleteJob,

  // Loan Cost Service
  calculateLoanCost,
  getLoanCostById,

  // Request Tracking Service
  createRequestTracking,
  getRequestTrackings,
  getRequestTrackingById,
  updateRequestTracking,
  deleteRequestTracking,

  // Savings Accounts Service
  createSavingsAccount,
  getSavingsAccounts,
  getSavingsAccountByRut,
  updateSavingsAccount,
  deleteSavingsAccount,
};