package main.model;

import utils.GitUtils;

public final class MainModel {

	private String projectPath;

	public final String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(final String projectPath) {
		this.projectPath = projectPath;
	}

	//

	private String branch;

	public final String getBranch() {
		return branch;
	}

	//

	public final void init() {
		refresh();
	}

	public final void refresh() {
		branch = parseBranch(GitUtils.gitBranch(projectPath));
	}

	private final String parseBranch(final String gitBranchResult) {
		return gitBranchResult;
	}

}
