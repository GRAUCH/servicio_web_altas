<g:if test="${flash.error}">
	<g:if test="${flash.error}">
		<div class="alert alert-error alert-block" style="margin-top: 15px;">
			<a class="close" data-dismiss="alert" href="#">&times;</a>
			<h4 class="alert-heading">Error!</h4>
			${flash.error}
		</div>
	</g:if>
</g:if>
<g:if test="${flash.message}">
	<g:if test="${flash.message}">
		<div class="alert alert-info alert-block" style="margin-top: 15px;">
			<a class="close" data-dismiss="alert" href="#">&times;</a>
			<h4 class="alert-heading">Info!</h4>
			${flash.message}
		</div>
	</g:if>
</g:if>