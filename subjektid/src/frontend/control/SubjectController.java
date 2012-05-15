package frontend.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import log.MyLogger;

import backend.DA.SubjectsORM;
import backend.model.EmployeeRoleType;
import backend.model.Enterprise;

public class SubjectController extends Controller {

	@Override
	public String service(HttpServletRequest req, HttpServletResponse resp) {

		String view = "default_view";
		SessionManager sessionManager = new SessionManager(req);

		if (sessionManager.loggedIn()) {
			if (action.equals("show_form")) {
				try {
					SubjectsORM dao = new SubjectsORM();
					List<EmployeeRoleType> employeeRoleTypeList = dao
							.findAll(EmployeeRoleType.class);
					List<Enterprise> enterpriseList = dao
							.findAll(Enterprise.class);

					req.setAttribute("employeeRoleTypeList",
							employeeRoleTypeList);
					req.setAttribute("enterpriseList", enterpriseList);
					view = "add_new_subject_view";
				} catch (Exception e) {
					MyLogger.log("SubjectController:AddNewSubject",
							e.getMessage());
				}
			}
		} else {
			view = "login_view";
		}

		return view;
	}

}
